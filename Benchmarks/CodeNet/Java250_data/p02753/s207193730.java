import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
      
      String  a = sc.next();
         
      char aa = a.charAt(0);
      char bb = a.charAt(1);
      char cc = a.charAt(2);
         
      if (aa == bb && bb == cc) {
         System.out.println("No");
      } else {
         System.out.println("Yes");
      }
   }        
}
