import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * The Shortest Path on A Rhombic Path
 */
public class Main {

	public static int MAX = 100;
	public static int[] H = {0, 1};
	public static int[] V = {1, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int[][] dp = new int[MAX][MAX];

		int prevLen = 0, maxLen = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {

			String[] words = line.split(",");

			if (words.length > prevLen) {
				for (int i = 0, c = 0, r = words.length - 1; i < words.length; i++, c++, r--) {
					dp[r][c] = parseInt(words[i]);
				}
			} else {
				for (int i = 0, c = maxLen - words.length, r = maxLen - 1; i < words.length; i++, c++, r--) {
					dp[r][c] = parseInt(words[i]);
				}
			}

			prevLen = words.length;
			maxLen = Math.max(maxLen, words.length);

		}

		for (int i = 0; i < maxLen; i++) {
			for (int j = 0; j < maxLen; j++) {
				if (i == 0 && j != 0) {
					dp[i][j] += dp[i][j - 1];
				} else if (i != 0 && j == 0) {
					dp[i][j] += dp[i - 1][j];
				} else if (i != 0 && j != 0) {
					dp[i][j] += Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		System.out.println(dp[maxLen - 1][maxLen - 1]);

	}

}