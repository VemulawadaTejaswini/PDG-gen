// ALDS1_01 Insertion Sort
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try { 
         int N = Integer.parseInt(br.readLine());
         int[] A = new int[N];
         String[] input = br.readLine().split(" ");
         for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
         }
         insertionSort(A, N);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   public static void insertionSort(int[] A, int N) {
      for (int i = 1; i <= A.length - 1; i++) {
         for (int k = 0; k < N; k++) {
            System.out.print((k == N - 1) ? A[k] + "\n" : A[k] + " ");
         }
         int key = A[i];
         int j = i - 1;
         while (j >= 0 && A[j] > key) {
            A[j + 1] = A[j];
            j--;
         }
         A[j + 1] = key;
      }
      for (int k = 0; k < N; k++) {
         System.out.print((k == N - 1) ? A[k] + "\n" : A[k] + " ");
      }
   }
}