import java.util.*;
public class Main  {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String a = sc.next();
      
      char[] aa = a.toCharArray();
      
      if (Character.isUpperCase(aa[0])) {
         System.out.println("A");
      } else {
         System.out.println("a");
      }
   }
}