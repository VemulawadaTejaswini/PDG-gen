// ITP1_5_D Structured Programming
import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int i = 1;
      while (++i <= n) {
         int x = i;
         while (true) {
            if (x % 3 == 0) {
               System.out.print(" " + i); break;
            } else if (x % 10 == 3) {
               System.out.print(" " + i); break;
            }
            x /= 10;
            if (x == 0) break;
         }
      }
      System.out.println();
   }
}