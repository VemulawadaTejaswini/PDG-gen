// ALDS1_2_D Shell Sort
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int n = Integer.parseInt(br.readLine());
         int[] A = new int[n];
         for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
         }
         shellSort(A, n);
      }

      catch (Exception e) {
         e.printStackTrace();
      }
   }

   static int insertionSort(int[] A, int n, int g) {
      int cnt = 0;
      for (int i = g; i < n; i++) {
         int val = A[i];
         int j = i - g;
         while (j >= 0 && A[j] > val) {
            A[j + g] = A[j];
            j = j - g;
            cnt++;
         }
         A[j + g] = val;
      }
      return cnt;
   }

   static void shellSort(int[] A, int n) {
      int cnt = 0;
      int[] G = new int[13];
      int m = 1;
      G[0] = 1;
      for (int i = 1; i < n; i = i * 3 + 1) {
         G[i] = G[i - 1] * 3 + 1;
         if (G[i] > n) break;
         m++;
      }
      for (int i = m - 1; i >= 0; i--) {
         cnt += insertionSort(A, n, G[i]);
      }
      System.out.println(m);
      for (int i = m - 1; i >= 0; i--) {
         if (i != m - 1) {
            System.out.print(" ");
         }
         System.out.print(G[i]);
      }
      System.out.println();
      System.out.println(cnt);
      for (int a : A) {
         System.out.println(a);
      }
   }
}