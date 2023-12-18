import java.util.Scanner;

public class Main {
	public static int[] CountingSort(int[] A, int n, int k) {
		int[] B = new int[n], C = new int[k + 1];
		for (int i = 0; i < n; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < k + 1; i++) {
			C[i] += C[i - 1];
		}
		for (int i = n - 1; i >= 0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
		return B;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = 10000;
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int[] B = CountingSort(A, n, k);
		StringBuilder sb = new StringBuilder();
		sb.append(B[0]);
		for (int i = 1; i < n; i++) {
			sb.append(" " + B[i]);
		}
		System.out.println(sb.toString());
	}
}
