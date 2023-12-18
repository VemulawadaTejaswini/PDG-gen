import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int[] C;
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			if(max < A[i]) max = A[i];
		}
		int[] B = new int[n+1]; 
		CountingSort(A,B,max);
		
		for(int i = 1; i <= n; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(B[n]);
		sc.close();
	}
	
	void CountingSort(int[] A,int[] B,int k) {
		C = new int[k + 1];
		Arrays.fill(C, 0);
		for (int i = 0; i < A.length; i++) {
			C[A[i]]++;
		}
		for(int j = 1; j <= k; j++) {
			C[j] = C[j] + C[j-1];
		}
		for(int i = A.length-1; i >= 0; i--) {
			B[C[A[i]]] =A[i];
			C[A[i]]--;
		}
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
