import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/simplepost")
public class simplepost extends HttpServlet {
	 
   private static final long serialVersionUID = 205242440643911308L;
   public static String userid=null;
   public static String deviceid=null;
    
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
   	 userid = request.getParameter("enduserid");
       deviceid = request.getParameter("deviceid");
       //String text="userid= "+userid+"\n"+"deviceid= "+deviceid+"\n";
       request.setAttribute("message", "request post successfully!");
       getServletContext().getRequestDispatcher("/response.jsp").forward(
               request, response);

   }  
	
	
}