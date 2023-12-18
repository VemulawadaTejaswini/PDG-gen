
import java.util.Scanner;

public class Main {
	long count = 0;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int K = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
			K = Math.max(K, A[i]);
		}
		CountingSort(A, B, K);
		for (int i = 0; i < n; i++) {
			System.out.print(B[i]);
			System.out.print(i == n - 1 ? '\n' : ' ');
		}
	}

	private void CountingSort(int[] a, int[] b, int k) {
		int[] C = new int[k + 1];
		for (int i = 0; i < a.length; i++)
			C[a[i]]++;

		for (int i = 1; i <= k; i++)
			C[i] += C[i - 1];

		for (int i = a.length - 1; i >= 0; i--) {
			C[a[i]]--;
			b[C[a[i]]] = a[i];
			
		}
	}
}