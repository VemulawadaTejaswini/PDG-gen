import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Frog Going Straight
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int D, L;
		D = parseInt(line.substring(0, line.indexOf(' ')));
		L = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] dp = new int[D + 1];

		for (int i = 0; i <= D; i++) {
			dp[i] = i;
			if (i >= L) {
				dp[i] = Math.min(dp[i], dp[i - L] + 1);
			}
		}

		System.out.println(dp[D]);
	}
}