import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextInt();
		long[] A = new long[N + 1];
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt() + A[i - 1];
		}
		long[] B = new long[M + 1];
		B[0] = 0;
		for (int i = 1; i <= M; i++) {
			B[i] = sc.nextInt() + B[i - 1];
		}

		int result = 0;
		int maxB = M;
		for (int i = 0; i <= N && A[i] <= K; i++) {
			long K2 = K - A[i];
			for (int j = maxB; j >= 0; j--) {
				if (B[j] <= K2) {
					if (result < i + j)
						result = i + j;
					maxB = j;
					break;
				}
			}
		}

		System.out.println(result);
	}
}
