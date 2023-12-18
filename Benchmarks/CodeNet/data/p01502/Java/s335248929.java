import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Sightseeing Tour
 */
public class P2386 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;

		int n = parseInt(br.readLine());

		int[][] G = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				G[i][j] = parseInt(st.nextToken());
			}
		}

		long ans = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				ans += Math.min(G[i][j], G[j][i]);
			}
		}

		System.out.println(ans);
	}
}