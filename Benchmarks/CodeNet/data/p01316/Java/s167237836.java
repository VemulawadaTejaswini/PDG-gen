import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Differential Pulse Code Modulation
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			int[] C = new int[M];
			for (int i = 0; i < M; i++) C[i] = parseInt(br.readLine());

			//
			int[][] dp = new int[N + 1][256];
			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], INF);
			}

			dp[0][128] = 0;

			for (int n = 1; n <= N; n++) {
				int x = parseInt(br.readLine());
				for (int i = 0; i < 256; i++) {
					for (int m = 0; m < M; m++) {
						int _x = i + C[m];
						if (255 < _x) _x = 255;
						if (_x < 0) _x = 0;
						int cost = (_x - x) * (_x - x);
						dp[n][_x] = Math.min(dp[n][_x], dp[n - 1][i] + cost);
					}
				}
			}

			int min = INF;

			for (int i = 0; i < 256; i++) {
				min = Math.min(min, dp[N][i]);
			}

			System.out.println(min);

		}
	}
}