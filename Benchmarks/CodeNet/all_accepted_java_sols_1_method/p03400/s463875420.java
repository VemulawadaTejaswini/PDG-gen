import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int d = sc.nextInt();
      int x = sc.nextInt();

      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
      }

      int c = 0;

      for (int i = 0; i < a.length; i++) {
         int b = a[i];
         for (int j = 0; j * b + 1 <= d; j++) {
            c++;
         }
      }

      System.out.println(c + x);

   }
}