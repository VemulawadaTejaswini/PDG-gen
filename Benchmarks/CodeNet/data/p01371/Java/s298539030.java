import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Fastest Route
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);
			if (N == 0) break;

			int[][] items = new int[N][N + 1];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j <= N; j++) {
					items[i][j] = parseInt(st.nextToken());
				}
			}

			//
			int[] dp = new int[1 << N];

			Arrays.fill(dp, 1, dp.length, INF);

			for (int i = 0; i < 1 << N; i++) {
				for (int j = 0; j < N; j++) {
					if ((i >> j & 1) == 0) {
						int fastest = items[j][0];
						for (int k = 1; k <= N; k++) {
							if (((i >> (k - 1)) & 1) == 1) {
								fastest = Math.min(fastest, items[j][k]);
							}
						}
						dp[i | 1 << j] = Math.min(dp[i | 1 << j], dp[i] + fastest);
					}
				}
			}

			System.out.println(dp[(1 << N) - 1]);
		}
	}
}