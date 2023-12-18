import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int K = sc.nextInt();
			int[] dp = new int[N * M + 1];
			dp[0] = 1;
			for (int i = 0; i < N; ++i) {
				for (int j = N * M; j >= 0; --j) {
					dp[j] = 0;
					for (int k = 1; k <= M && j - k >= 0; ++k) {
						dp[j] += dp[j - k];
					}
				}
			}
			double all = 1.0;
			for (int i = 0; i < N; ++i) {
				all *= M;
			}
			double ans = 0;
			for (int i = 1; i <= K; ++i) {
				ans += dp[i] / all;
			}
			for (int i = K + 1; i <= N * M; ++i) {
				ans += (i - K) * dp[i] / all;
			}
			System.out.printf("%.9f\n", ans);
		}
	}
}