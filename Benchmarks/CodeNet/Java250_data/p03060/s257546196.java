import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] vset = new int[n];
      int[] cset = new int[n];
      int i,j;
      int sum = 0;
      int cost = 0;
      for (i = 0; i < n; i++) {
         vset[i] = sc.nextInt();
      }
      for (i=0; i<n; i++) {
         cset[i] = sc.nextInt();
      }
      for (i=0; i<n; i++) {
         cost = vset[i] - cset[i];
         if (cost > 0) {
            sum = sum + cost;
         } else {
            continue;
         }
      }
      System.out.println(sum);
   }
}
