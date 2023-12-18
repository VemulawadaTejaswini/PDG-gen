import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int N = sc.nextInt();
		long[] w = new long[N];
		for (int i = 0; i < N; ++i) {
			w[i] = sc.nextLong();
		}
		long[][] dp = new long[N][N];
		int[][] cut = new int[N][N];
		for (long[] a : dp) {
			Arrays.fill(a, 1L << 60);
		}
		for (int i = 0; i < N; ++i) {
			dp[i][i] = 0;
		}
		for (int i = 0; i < N - 1; ++i) {
			dp[i][i + 1] = w[i] + w[i + 1];
			cut[i][i + 1] = i;
		}
		for (int i = 2; i < N; ++i) {
			long sum = 0;
			for (int j = 0; j < i; ++j) {
				sum += w[j];
			}
			for (int j = 0; j + i < N; ++j) {
				sum += w[j + i];
				int c1 = cut[j][j + i - 1];
				int c2 = cut[j + 1][j + i];
				for (int k = c1; k <= c2; ++k) {
					if (dp[j][k] + dp[k + 1][j + i] < dp[j][j + i]) {
						dp[j][j + i] = dp[j][k] + dp[k + 1][j + i];
						cut[j][j + i] = k;
					}
				}
				dp[j][j + i] += sum;
				sum -= w[j];
			}
		}
		System.out.println(dp[0][N - 1]);
	}
}