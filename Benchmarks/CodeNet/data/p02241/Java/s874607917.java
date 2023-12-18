
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int n;
	boolean[] color;
	int[][] map;
	int INF = 1 << 24;

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int e = scanner.nextInt();
				map[i][j] = e == -1 ? INF : e;
			}
		}
		System.out.println(prim());
	}

	private int prim() {
		int u;
		int minv;
		int[] d = new int[n];
		int[] p = new int[n];
		color = new boolean[n];
		Arrays.fill(d, INF);
		Arrays.fill(p, -1);
		d[0] = 0;
		while (true) {
			minv = 1 << 24;
			u = -1;
			for (int i = 0; i < n; i++) {
				if (minv > d[i] && !color[i]) {
					u = i;
					minv = d[i];
				}
			}
			if (u == -1)
				break;
			color[u] = true;
			for (int v = 0; v < n; v++) {
				if (!color[v]&& map[u][v] != INF) {
					if (d[v] > map[u][v]) {
						d[v] = map[u][v];
						p[v] = u;
					}
				}

			}

		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] != -1)
				sum += map[i][p[i]];
		}
		return sum;

	}
}