
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
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
		int[] d = new int[n];
		color = new boolean[n];
		Arrays.fill(d, INF);
		d[0] = 0;
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(0);
		while (!deque.isEmpty()) {
			int u = deque.poll();
			color[u] = true;
			int minv = INF;
			int next = -1;
			for (int i = 0; i < n; i++) {
				if (d[i] > d[u] + map[u][i]) {
					d[i] = d[u] + map[u][i];
				}
				if (!color[i] && minv > d[i]) {
					minv = d[i];
					next = i;
				}

			}
			if (next != -1)
				deque.push(next);
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("%d %d\n", i, d[i] == INF ? -1 : d[i]);
		}

	}
}