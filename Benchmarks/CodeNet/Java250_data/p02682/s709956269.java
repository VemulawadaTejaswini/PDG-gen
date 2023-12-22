import java.util.*;

public class Main  {
   public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
      
      
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long k = sc.nextLong();
                
      if (a > k) {
         System.out.println(k);
      } else if (a == k) {
         System.out.println(a);
      } else {
         if (b >= (k - a)) {
            System.out.println(a);
         } else {
            System.out.println(a - (k - (a + b)));
         }
      }      
   }
}