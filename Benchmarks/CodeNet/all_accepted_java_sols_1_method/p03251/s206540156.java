import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();
      int xc = sc.nextInt();
      int yc = sc.nextInt();

      int[] x = new int[n];
      for (int i = 0; i < x.length; i++) {
         x[i] = sc.nextInt();
      }

      int[] y = new int[m];
      for (int i = 0; i < y.length; i++) {
         y[i] = sc.nextInt();
      }

      Arrays.sort(x);
      Arrays.sort(y);

      if (x[x.length - 1] >= y[0]) {
         System.out.println("War");
      }
      else {
         if (x[x.length - 1] < yc && y[0] > xc) {
            System.out.println("No War");
            }
         else {
            System.out.println("War");
         }
      }

   }
}