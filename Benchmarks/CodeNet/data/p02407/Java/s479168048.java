// ITP1_6_A Reversing Numbers

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] a;
      int n = Integer.parseInt(sc.next());
      if (n <= 100) {
         a = new int[n];
         for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
         }
         for (int i = n - 1; i >= 1; i--) {
            System.out.print(a[i] + " ");
         }
         System.out.println(a[0]);
      }
   }
}