import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Cicada
 */
public class Main {

	static int INF = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int H, W;
		H = parseInt(line.substring(0, line.indexOf(' ')));
		W = parseInt(line.substring(line.indexOf(' ') + 1));

		int[][] dp = new int[H + 2][W + 2];

		for (int i = 0; i < H + 2; i++) {
			for (int j = 0; j < W + 2; j++) {
				dp[i][j] = INF;
			}
		}
		dp[0][1] = 0;
		dp[1][0] = 0;

		for (int i = 0; i < H; i++) {
			line = br.readLine();
			for (int j = 0; j < W; j++) {
				dp[i + 1][j + 1] = line.charAt(j) - '0';
			}
		}

		//solve
		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				dp[i][j] += Math.min(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		System.out.println(dp[H][W]);
	} //end main
}