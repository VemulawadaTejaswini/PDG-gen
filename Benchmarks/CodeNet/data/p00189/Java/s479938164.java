import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Convenient Location
 */
public class Main {

	static final int MAX_LOC = 10;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			//init
			long[][] g = new long[MAX_LOC][MAX_LOC];
			int N = 0;

			for (int i = 0; i < g.length; i++) {
				for (int j = 0; j < g[i].length; j++) {
					if (i != j) g[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < n; i++) {
				words = br.readLine().split(" ");
				int x, y, d;
				x = parseInt(words[0]);
				y = parseInt(words[1]);
				d = parseInt(words[2]);
				N = Math.max(N, Math.max(x, y));
				g[y][x] = g[x][y] = d;
			}

			//solve
			for (int k = 0; k <= N; k++) {
				for (int i = 0; i <= N; i++) {
					for (int j = 0; j <= N; j++) {
						g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
					}
				}
			}

			int pos = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i <= N; i++) {
				int tmp = 0;
				for (int j = 0; j <= N; j++) {
					tmp += g[i][j];
				}
				if (tmp < min) {
					pos = i;
					min = tmp;
				}
			}

			System.out.println(pos + " " + min);

		}//end while
	}// end main
}