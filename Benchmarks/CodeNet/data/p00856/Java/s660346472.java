import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int T = sc.nextInt();
			int L = sc.nextInt();
			int B = sc.nextInt();
			boolean[] lose = new boolean[N + 1];
			boolean[] back = new boolean[N + 1];
			for (int i = 0; i < L; ++i) {
				lose[sc.nextInt()] = true;
			}
			for (int i = 0; i < B; ++i) {
				back[sc.nextInt()] = true;
			}
			double ans = 0;
			double[][] dp = new double[N + 1][T + 2];
			dp[0][0] = 1;
			for (int i = 0; i < T; ++i) {
				for (int j = 0; j < N; ++j) {
					for (int k = 1; k <= 6; ++k) {
						int pos = j + k;
						if (pos > N) pos = N - (pos - N);
						if (lose[pos]) {
							dp[pos][i + 2] += dp[j][i] / 6;
						} else if (back[pos]) {
							dp[0][i + 1] += dp[j][i] / 6;
						} else {
							dp[pos][i + 1] += dp[j][i] / 6;
						}
					}
				}
				ans += dp[N][i + 1];
			}
			System.out.printf("%.7f\n", ans);
		}
	}

}