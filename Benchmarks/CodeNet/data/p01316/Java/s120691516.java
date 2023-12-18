import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] C = new int[M];
			for (int i = 0; i < M; ++i) {
				C[i] = sc.nextInt();
			}
			int[] X = new int[N];
			for (int i = 0; i < N; ++i) {
				X[i] = sc.nextInt();
			}
			int[][] dp = new int[2][256];
			Arrays.fill(dp[0], 1 << 30);
			dp[0][128] = 0;
			int t = 0;
			for (int i = 0; i < N; ++i) {
				Arrays.fill(dp[1 - t], 1 << 30);
				for (int j = 0; j < 256; ++j) {
					for (int k = 0; k < M; ++k) {
						int next = j + C[k];
						if (next < 0) next = 0;
						if (next > 255) next = 255;
						dp[1 - t][next] = Math.min(dp[1 - t][next], dp[t][j] + (X[i] - next) * (X[i] - next));
					}
				}
				t = 1 - t;
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < 256; ++i) {
				ans = Math.min(ans, dp[t][i]);
			}
			System.out.println(ans);
		}
	}
}