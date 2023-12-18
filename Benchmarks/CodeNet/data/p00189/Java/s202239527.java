import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Convenient Location
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[][] rs = new int[n][3];
			int N = 0;
			for (int i = 0; i < n; i++) {
				words = br.readLine().split(" ");
				rs[i][0] = parseInt(words[0]);
				rs[i][1] = parseInt(words[1]);
				rs[i][2] = parseInt(words[2]);
				N = Math.max(N, Math.max(rs[i][0], rs[i][1]));
			}
			N++;

			//init
			int[][] g = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (i != j) g[i][j] = Integer.MAX_VALUE;
				}
			}
			for (int i = 0; i < n; i++) {
				g[rs[i][0]][rs[i][1]] = rs[i][2];
				g[rs[i][1]][rs[i][0]] = rs[i][2];
			}

			//solve
			for (int k = 0; k < N; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
					}
				}
			}

			int pos = Integer.MAX_VALUE;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				int tmp = 0;
				for (int j = 0; j < N; j++) {
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