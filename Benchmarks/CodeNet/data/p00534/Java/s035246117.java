import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Silk Road
 * JOI 14th, Pre 4
 */
public class Main {

	static final long INF = (long) Math.pow(1000, 3) + 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();
		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		long[][] dp = new long[N + 1][M + 1];
		int[] ds = new int[N];
		int[] cs = new int[M];

		for (int i = 0; i < N; i++) ds[i] = parseInt(br.readLine());
		for (int i = 0; i < M; i++) cs[i] = parseInt(br.readLine());

		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < M + 1; j++) {
				dp[i][j] = INF;
			}
		}

		dp[0][0] = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j]);
				dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + cs[j] * ds[i]);
			}
		}
		long min = INF;
		for (int i = 0; i < M; i++) {
			min = Math.min(min, dp[N][i]);
		}
		System.out.println(min);
	}
}