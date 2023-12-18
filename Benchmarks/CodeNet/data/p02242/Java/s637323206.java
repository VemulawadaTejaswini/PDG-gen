
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
		for (int[] a : map)
			Arrays.fill(a, INF);
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				int c = scanner.nextInt();
				map[u][v] = c;
			}

		}
		dijkstra();
	}

	private void dijkstra() {
		int minv;
		int[] d = new int[n];
		color = new boolean[n];
		Arrays.fill(d, INF);
		d[0] = 0;
		while (true) {
			minv = INF;
			int u = -1;
			for (int i = 0; i < n; i++) {
				if (minv > d[i] && !color[i]) {
					u = i;
					minv = d[i];
				}
			}
			if (u == -1)
				break;
			color[u] = true;
			for (int i = 0; i < n; i++) {
				if (!color[i] && d[i] > d[u] + map[u][i]) {
					d[i] = d[u] + map[u][i];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", i, d[i] == INF ? -1 : d[i]);
		}

	}
}