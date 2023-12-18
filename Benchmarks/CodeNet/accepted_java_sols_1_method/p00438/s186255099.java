import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * School Road (DP)
 */
public class Main {

	static final int KEEPOUT = -1;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			// read
			int a = parseInt(line.substring(0, line.indexOf(' ')));
			int b = parseInt(line.substring(line.indexOf(' ') + 1));
			int n = parseInt(br.readLine());

			int[][] dp = new int[a + 1][b + 1];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x = parseInt(line.substring(0, line.indexOf(' ')));
				int y = parseInt(line.substring(line.indexOf(' ') + 1));
				dp[x][y] = KEEPOUT;
			}

			// solve
			dp[1][1] = 1;

			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= b; j++) {
					if ((i | j) != 1 && dp[i][j] != KEEPOUT) {
						int p = dp[i - 1][j] != KEEPOUT ? dp[i - 1][j] : 0;
						int q = dp[i][j - 1] != KEEPOUT ? dp[i][j - 1] : 0;
						dp[i][j] = p + q;
					}
				}
			}
			System.out.println(dp[a][b]);
		}

	}
}