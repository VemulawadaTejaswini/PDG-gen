import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[M];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; ++i) {
			B[i] = sc.nextInt();
		}
		int[] dp = new int[M + 1];
		for (int i = 0; i < N; ++i) {
			for (int j = M - 1; j >= 0; --j) {
				if (A[i] == B[j]) {
					dp[j + 1] = Math.max(dp[j + 1], dp[j] + 1);
				}
			}
		}
		int ans = 0;
		for (int i = 1; i <= M; ++i) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
	}
}