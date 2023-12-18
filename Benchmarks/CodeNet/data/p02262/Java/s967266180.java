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
      int count = 0;
      for (int i = g; i < n; i++) {
         int val = A[i];
         int j = i - g;
         while (j >= 0 && A[j] > val) {
            A[j + g] = A[j];
            j = j - g;
            count++;
         }
         A[j + g] = val;
      }
      return count;
   }

   static void shellSort(int[] A, int n) {
      int cnt = 0;
      int m = n / 2;
      System.out.println(m);
      int[] G = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161};
      for (int i = m - 1; i >= 0; i--) {
         System.out.print((i == 0) ? G[i] + "\n" : G[i] + " ");
      }
      for (int i = m - 1; i >= 0; i--) {
         cnt += insertionSort(A, n, G[i]);
      }
      System.out.println(cnt);
      for (int a : A) {
         System.out.println(a);
      }
   }
}