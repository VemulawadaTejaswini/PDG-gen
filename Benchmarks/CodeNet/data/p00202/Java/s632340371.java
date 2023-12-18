/**
 * At Boss's Expense
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

	static boolean[] primes = new boolean[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		//
		Arrays.fill(primes, true);
		for (int i = 2; i < 1000000 / 2 + 1; i++) {
			if (primes[i]) {
				for (int j = i; j < 1000000 / i + 1; j += i) {
					primes[i + j] = false;
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int x = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | x) == 0) break;

			int max = 0;
			int[] dp = new int[x + 1];
			int[] c = new int[n];

			for (int i = 0; i < n; i++) c[i] = parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				for (int j = c[i]; j <= x; j++) {
					dp[j] = Math.max(dp[j], dp[j - c[i]] + c[i]);
					if (primes[dp[j]]) max = Math.max(max, dp[j]);
				}
			}
			System.out.println(max != 0 ? max : "NA");
		}//end while
	}//end main
}