// ALDS1_2_A Bubble Sort
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      try {
         int N = Integer.parseInt(br.readLine());
         int[] A = new int[N];
         String[] inputAry = br.readLine().split(" ");
         for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputAry[i]);
         }
         bubblesort(A, N);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static void bubblesort(int[] A, int N) {
      int cnt = 0;
      int tmp;
      boolean flag = true;
      while (flag) {
         flag = false;
         for (int j = N - 1; j >= 1; j--){
            if (A[j] < A[j - 1]) {
               tmp = A[j];
               A[j] = A[j - 1];
               A[j - 1] = tmp;
               cnt++;
               flag = true;
            }
         }
      }
      for (int i = 0; i < N; i++) {
         if (i == N - 1) {
            System.out.println(A[i]);
         } else {
            System.out.print(A[i] + " ");
         }
      }
      System.out.println(cnt);
   }
}