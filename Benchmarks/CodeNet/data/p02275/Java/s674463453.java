import java.io.IOException;
import java.util.Scanner;

class Main {
	static final int INF = 1000000001;

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   Scanner scanner = new Scanner(System.in);

	   int n = scanner.nextInt();
	   StringBuilder builder = new StringBuilder();

	   int[] A = new int[n];
	   int[] B = new int[n];
	   int K = Integer.MIN_VALUE;
	   for(int i = 0;i < n; i++){
		   A[i] = scanner.nextInt();
		   K = Math.max(K, A[i]);
	   }

	   CountingSort( A, B, K, n);


	   builder.append(B[0]);
       for (int i = 1; i < n; i++) {
           builder.append(' ').append(B[i]);
       }
       System.out.println(builder);
	   scanner.close();
   }






   public static void CountingSort(int[] A, int[] B, int k , int n){

	   int[] C = new int[k+1];

       for (int i = 0; i < A.length; i++)
           C[A[i]]++;

       for (int i = 1; i <= k; i++)
           C[i] += C[i - 1];

       for (int i = A.length - 1; i >= 0; i--) {
           C[A[i]]--;
           B[C[A[i]]] = A[i];

       }


   }
}