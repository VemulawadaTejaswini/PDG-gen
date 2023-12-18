import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A Thief
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int c = 0;
		while (!(line = br.readLine()).equals("0")) {
			c++;
			int w = parseInt(line);
			int n = parseInt(br.readLine());

			int[][] dp = new int[n + 1][w + 1];
			int[] vs = new int[n + 1];
			int[] ws = new int[n + 1];

			for (int i = 1; i < n + 1; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(',')));
				ws[i] = parseInt(line.substring(line.indexOf(',') + 1));
			}

			int value = 0;
			int weight = w;
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < w + 1; j++) {
					if (j >= ws[i]) {
						dp[i][j] = Math.max(dp[i - 1][j - ws[i]] + vs[i],
								dp[i - 1][j]);
						if (dp[i][j] > value) {
							value = dp[i][j];
							if (j < weight) {
								weight = j;
							}
						}
					} else {
						dp[i][j] = dp[i - 1][j];
					}
				}
			}
			System.out.print(String.format("Case %d:\n%d\n%d\n", c, value,
					weight));
		}

	}

}