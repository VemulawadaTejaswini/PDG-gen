import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Highway Express Bus
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int c, n, m, s, d;
			c = parseInt(st.nextToken());   //?????????????????°
			n = parseInt(st.nextToken());   //????????°
			m = parseInt(st.nextToken());   //?????????????????°
			s = parseInt(st.nextToken());   //????????????
			d = parseInt(st.nextToken());   //????????°??????
			if ((c | n | m | s | d) == 0) break;

			int[][] G = new int[n + 1][n + 1];

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= n; j++) {
					G[i][j] = INF;
				}
			}

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int a, b, f;
				a = parseInt(st.nextToken());
				b = parseInt(st.nextToken());
				f = parseInt(st.nextToken());
				G[a][b] = G[b][a] = f;
			}

			//
			int[][] D = new int[n + 1][c + 1];
			boolean[][] V = new boolean[n + 1][c + 1];

			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= c; j++) {
					D[i][j] = INF;
				}
			}
			D[s][c] = 0;

			//
			while (true) {

				int u = -1, k = -1, min = INF;

				for (int i = 1; i <= n; i++) {
					for (int j = 0; j <= c; j++) {
						if (!V[i][j] && D[i][j] < min) {
							min = D[i][j];
							u = i;
							k = j;
						}
					}
				}

				if (min == INF) break;

				//
				V[u][k] = true;

				for (int v = 1; v <= n; v++) {
					if (G[u][v] == INF) continue;
					D[v][k] = Math.min(D[v][k], G[u][v] + min);
					if (k > 0) {
						D[v][k - 1] = Math.min(D[v][k - 1], G[u][v] / 2 + min);
					}
				}
			}

			//
			int min = INF;

			for (int i = 0; i <= c; i++) {
				min = Math.min(min, D[d][i]);
			}

			System.out.println(min);
		}
	}
}