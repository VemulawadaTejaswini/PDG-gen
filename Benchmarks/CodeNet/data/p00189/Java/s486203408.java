import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	static final int INF = 1001001001;
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int m = sc.nextInt();
			if (m == 0) break;
			int n = 16;
			int[][] d = new int[n][n];
			for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) d[i][j] = INF;
			for (int i = 0; i < n; i++) d[i][i] = 0;
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				if (d[a][b] > c) {
					d[a][b] = c;
					d[b][a] = c;
				}
			}
			
			for (int k = 0; k < n; k++) for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
				d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
			}
			
			int bp = 0;
			int best = INF;
			for (int p = 0; p < n; p++) if (d[0][p] < INF) {
				int here = 0;
				for (int i = 0; i < n; i++) if (d[i][p] < INF) here += d[i][p];
				if (best > here) {
					best = here;
					bp = p;
				}
			}
			System.out.println((bp) + " " + best);
		}
	}
}