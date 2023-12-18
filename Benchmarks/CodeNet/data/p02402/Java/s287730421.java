import java.util.*;

public class main {
   public static void main(string[] args) {
      scanner sc = new scanner(system.in);
      int n = integer.parseint(sc.next());
      int[] a = new int[n];
      long sum = 0;
      for (int i = 0; i < n; i++) {
         a[i] = integer.parseint(sc.next());
         sum += (long)a[i];
      }
      int max = a[0];
      int min = a[0];
      for (int i = 1; i < n; i++) {
         if (max < a[i]) {
            max = a[i];
         }
      }
      for (int i = 1; i < n; i++) {
         if (min > a[i]) {
            min = a[i];
         }
      }
      system.out.printf("%d %d %d\n", min, max, sum);
   }
}