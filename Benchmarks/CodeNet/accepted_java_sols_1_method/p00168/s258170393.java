import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Kannondou
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int[] dp = new int[34];
		dp[0] = 1;

		for (int i = 0; i <= 30; i++) {
			dp[i + 1] += dp[i];
			dp[i + 2] += dp[i];
			dp[i + 3] += dp[i];
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			System.out.println((dp[n] / 3650) + (dp[n] % 3650 > 0 ? 1 : 0));

		}
	}
}