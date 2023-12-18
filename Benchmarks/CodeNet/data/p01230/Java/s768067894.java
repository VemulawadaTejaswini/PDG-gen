import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Can I go there?
 */
public class Main {

	static int N, M, Z;
	static boolean[][] map;
	static boolean result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;


		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			N = parseInt(st.nextToken());
			M = parseInt(st.nextToken());
			Z = parseInt(st.nextToken());

			if ((N | M | Z) == 0) break;

			map = new boolean[N + 1][N + 1];
			for (int i = 0; i < M; i++) {
				line = br.readLine();
				int s = parseInt(line.substring(0, line.indexOf(' ')));
				int d = parseInt(line.substring(line.indexOf(' ') + 1));
				map[s][d] = map[d][s] = true;
			}
			result = false;
			solve(1, 0, Z);
			System.out.println(result ? "yes" : "no");
		} // end while
	} // end main

	static void solve(int n, int p, int z) {
		if (z < 0) {
			return;
		} else if (z == 0 && n == N) {
			result = true;
		} else {
			for (int i = 1; i <= N; i++) {
				if (i != p && map[n][i]) {
					solve(i, n, z - 1);
				}
			}
		}
	}
}