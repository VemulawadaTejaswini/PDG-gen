/**
 * Sum of Cards
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	static final int MAX = 1000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int m = parseInt(line);
			if (m == 0) break;

			int[] dp = new int[MAX + 1];
			int[] vs = new int[m];
			int[] ns = new int[m];
			for (int i = 0; i < m; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(' ')));
				ns[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//
			for (int i = 0; i < m; i++) {
				for (int j = MAX; j >= 0; j--) {
					if (dp[j] > 0) {
						for (int k = 1; k <= ns[i]; k++) {
							int idx = j + vs[i] * k;
							if (idx <= MAX) dp[idx] += dp[j];
						}
					}
				}
				for (int k = 1; k <= ns[i]; k++) {
					int idx = vs[i] * k;
					if (idx <= MAX) dp[idx]++;
				}
			}

			//
			int g = parseInt(br.readLine());
			for (int i = 0; i < g; i++) {
				int n = parseInt(br.readLine());
				System.out.println(dp[n]);
			}
		} //ene while
	}//end main
}