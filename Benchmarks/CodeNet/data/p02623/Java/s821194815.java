import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int K;
	static int[] A;
	static int[] B;
	static int[][] MAX;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		A = new int[N + 1];
		A[0] = 0;
		for (int i = 1; i <= N; i++) {
			A[i] = sc.nextInt() + A[i - 1];
		}
		B = new int[M + 1];
		B[0] = 0;
		for (int i = 1; i <= M; i++) {
			B[i] = sc.nextInt() + B[i - 1];
		}

		int result = 0;
		for (int i = 0; i <= N && A[i] <= K; i++) {
			for (int j = 0; j <= M && A[i] + B[j] <= K; j++) {
				if (result < i + j) {
					result = i + j;
				}
			}
		}

		System.out.println(result);
	}
}
