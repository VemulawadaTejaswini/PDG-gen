import java.util.Scanner;

public class Main {

	private static int n;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int MAX = 0;

		int[] A = new int[n+1];
		for (int i = 1; i < n+1; i++) {
			A[i] = sc.nextInt();
			MAX = Math.max(MAX, A[i]);
		}
		int[] B = new int[n+1];

		CountingSort(A, B, MAX);

		for (int i = 1; i < n; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println(B[n]);

	}

	public static void CountingSort(int[] A, int[] B, int MAX) {
		int[] C = new int[MAX+1];
		for (int i = 0; i < MAX+1; i++) {
			C[i] = 0;
		}

		for (int i = 1; i <= n; i++) {
			C[A[i]]++;
		}

		for (int i = 1; i < MAX+1; i++) {
			C[i] += C[i - 1];
		}

		for (int i = n; i > 0; i--) {
			B[C[A[i]]] = A[i];
			C[A[i]]--;
		}
	}
}