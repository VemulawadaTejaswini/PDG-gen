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
         trace(A, N);
         insertionSort(A, N);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static void insertionSort(int[] A, int N) {
      for (int i = 1; i < A.length; i++) {
         int key = A[i];
         int j = i - 1;
         while (j >= 0 && A[j] > key) {
            A[j + 1] = A[j];
            j--;
         }
         A[j + 1] = key;
         trace(A, N);
      }
   }
   static void trace(int[] A, int N) {
      for (int i = 0; i < A.length; i++) {
         if (i < N - 1) {
            System.out.print(A[i] + " ");
         } else { 
            System.out.println(A[i]);
         }
      }
   }
}