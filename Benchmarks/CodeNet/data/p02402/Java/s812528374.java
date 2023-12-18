import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int[] a = new int[n];
      long sum = 0;
      for (int i = 0; i < n; i++) {
         a[i] = Integer.parseInt(sc.next());
         sum += a[i];
      }
      int max = a[0];
      int min = a[0];
      for (int i = 1; i < n; i++ ) {
         if (max < a[i]) {
            max = a[i];
         } else if (min > a[i]) {
            min = a[i];
         }
      }
      System.out.printf("%d %d %d\n", min, max, sum);
   }
}