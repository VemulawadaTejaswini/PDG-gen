import java.util.*;
public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      int k = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int x = ( a/k + 1 ) * k;
            
      if (x <= b || a % k == 0 || b % k == 0 || k == 1) {
         System.out.println("OK");
      } else {
         System.out.println("NG");
      }
   }
}
