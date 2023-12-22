import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int k = sc.nextInt();

      long sum = 0;

      for (int j = 1; j < k + 1; j++) {
         for (int i = 1; i < k + 1; i++) {
            for (int h = 1; h < k + 1; h++) {
               int s = gcd(j, i);
               int t = gcd(s, h);
               sum = sum + t;
            }
         }
      }
      System.out.println(sum);

   }
   
   private static int gcd(int m, int n) {
      if (m < n)
         return gcd(n, m);
      if (n == 0)
         return m;
      return gcd(n, m % n);
   }

}
