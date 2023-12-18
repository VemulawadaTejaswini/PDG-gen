import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of Integers II
 */
public class Main {

	static int[][][] memo;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) break;

			memo = new int[101][n + 1][s + 1];

			System.out.println(solve(0, n, s));

		} // end while
	} // end main

	static int solve(int p, int n, int s) {

		if (memo[p][n][s] != 0) {
			return memo[p][n][s];
		}

		if (p < 100 && n == 0 && s == 0) {
			return 1;
		} else if (s >= p && n > 0) {
			memo[p][n][s] = solve(p + 1, n - 1, s - p) + solve(p + 1, n, s);
			return memo[p][n][s];
		} else {
			return 0;
		}
	}
}