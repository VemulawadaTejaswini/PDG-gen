import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		long[][] dp = new long[N + 1][K + 1];
		dp[0][K] = 1;
		for (int i = 0; i < N; i++) {
			long sum = 0;
			for (int j = 0; j < A[i] && j <= K; j++) {
				sum += dp[i][j];
			}
			sum %= MOD;
			for (int j = 0; j <= K; j++) {
				if (j + A[i] <= K) {
					sum += dp[i][j + A[i]];
					if (sum >= MOD) sum -= MOD;
				}
				dp[i + 1][j] = sum;
				sum += MOD - dp[i][j];
				if (sum >= MOD) sum -= MOD;
			}
		}
		System.out.println(dp[N][0]);
	}
}