import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * A New Plan of Aizu Ski Resort
 * PCK2009 ??????9
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int x, y;
			x = parseInt(line.substring(0, line.indexOf(' ')));
			y = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((x | y) == 0) break;

			int[][] course = new int[y + 4][x + 2];
			int[][] dp = new int[y + 4][x + 2];

			for (int i = 0; i < y; i++) {
				words = br.readLine().split(" ");
				for (int j = 0; j < words.length; j++) {
					course[i + 2][j + 1] = parseInt(words[j]);
				}
			}

			//
			for (int i = 1; i < x + 1; i++) {
				if (course[2][i] == 0) dp[2][i] = 1;
			}

			for (int i = 2; i < y + 2; i++) {
				for (int j = 1; j < x + 1; j++) {
					switch (course[i][j]) {
						case 0:
							if (course[i - 1][j - 1] == 0) {
								dp[i][j] += dp[i - 1][j - 1];
							}
							if (course[i - 1][j] == 0) {
								dp[i][j] += dp[i - 1][j];
							}
							if (course[i - 1][j + 1] == 0) {
								dp[i][j] += dp[i - 1][j + 1];
							}
							if (course[i - 2][j] == 2) {
								dp[i][j] += dp[i - 2][j];
							}
							break;
						case 1:
							break;
						case 2:
							if (course[i - 1][j] == 0) {
								dp[i][j] += dp[i - 1][j];
							}
							if (course[i - 2][j] == 2) {
								dp[i][j] += dp[i - 2][j];
							}
							break;
					}
				}
			}
			for (int i = y + 2; i < y + 4; i++) {
				for (int j = 1; j < x + 1; j++) {
					dp[i][j] += dp[i - 1][j];
					if (course[i - 2][j] == 2) {
						dp[i][j] += dp[i - 2][j];
					}
				}
			}

			//
			int sum = 0;
			for (int i = 1; i < x + 1; i++) sum += dp[y + 3][i];
			System.out.println(sum);
		}//end while
	}//end main
}