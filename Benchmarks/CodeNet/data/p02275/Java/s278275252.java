import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] A = new int[n];
		int[] B = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int k = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
			k = Math.max(k, A[i]);
		}
		reader.close();
		
		int[] C = new int[k+1];
		countingSort(n, A, B, C, k);
		System.out.print(B[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + B[i]);
		}
		System.out.println();
	}
	
	private void countingSort(int n, int[] A, int[] B, int[] C, int k) {
		for (int i = 0; i < n; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i <= k; i++) {
			C[i] = C[i] + C[i-1];
		}
		for (int i = n-1; i >= 0; i--) {
			B[C[A[i]]-1] = A[i];
			C[A[i]]--;
		}
	}
}

