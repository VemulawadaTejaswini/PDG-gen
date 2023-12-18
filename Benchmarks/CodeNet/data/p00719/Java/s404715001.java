import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Traveling by Stagecoach
 */
public class Main {

	static final double INF = 4000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			//
			int n, m, p, a, b;
			int[] T;
			double[][] G;
			double[][] D;    //[???????????????][?????£?????¬??????]
			boolean[][] V;   //?¨??????????????????????

			st = new StringTokenizer(line);
			n = parseInt(st.nextToken());
			m = parseInt(st.nextToken());
			p = parseInt(st.nextToken());
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			if ((n | m | p | a | b) == 0) break;

			//
			st = new StringTokenizer(br.readLine());
			T = new int[n];
			for (int i = 0; i < n; i++) T[i] = parseInt(st.nextToken());

			//
			G = new double[m + 1][m + 1];
			for (int i = 0; i <= m; i++) Arrays.fill(G[i], -1);

			for (int i = 0; i < p; i++) {
				st = new StringTokenizer(br.readLine());
				int x, y, z;
				x = parseInt(st.nextToken());
				y = parseInt(st.nextToken());
				z = parseInt(st.nextToken());
				G[x][y] = G[y][x] = (double) z;
			}

			//
			D = new double[m + 1][1 << n];
			V = new boolean[m + 1][1 << n];

			for (int i = 0; i <= m; i++) Arrays.fill(D[i], INF);
			D[a][0] = 0;

			while (true) {

				double min = INF;
				int v = -1, t = -1;

				for (int i = 1; i <= m; i++) {
					for (int j = 0; j < (1 << n); j++) {
						if (!V[i][j] && D[i][j] < min) {
							min = D[i][j];
							v = i; t = j;
						}
					}
				}

				if (v == b || v == -1) break;
				V[v][t] = true;

				for (int u = 1; u <= m; u++) {
					if (G[v][u] != -1) {
						for (int i = 0; i < n; i++) {
							if ((t >> i & 1) == 0) {
								double time = D[v][t] + (G[v][u] / T[i]);
								if (D[u][t | 1 << i] > time) {
									D[u][t | 1 << i] = time;
								}
							}
						}
					}
				}
			}

			double ans = INF;

			for (int i = 0; i < (1 << n); i++) {
				ans = Math.min(ans, D[b][i]);
			}

			System.out.println(ans != INF ? ans : "Impossible");
		}
	}
}