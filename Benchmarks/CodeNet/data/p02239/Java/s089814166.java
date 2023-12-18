
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	boolean[][] M;
	int n;
	boolean color[];
	int d[];
	int f[];

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		M = new boolean[n][n];
		color = new boolean[n];
		d = new int[n];
		f = new int[n];
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			u--;
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				v--;
				M[u][v] = true;
			}
		}
		bfs(0);
	}

	private void bfs(int s) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.offer(s);
		int count = 0;
		Arrays.fill(d, -1);
		d[0] = 0;
		color[0] = true;
		while (!deque.isEmpty()) {
			int size = deque.size();
			for (int i = 0; i < size; i++) {
				int q = deque.poll();
				d[q] = count;
				for (int j = 0; j < n; j++) {
					if (M[q][j] && !color[j]) {
						color[j] = true;
						deque.offer(j);
					}
				}
			}
			count++;

		}
		for (int u = 0; u < n; u++) {
			System.out.printf("%d %d\n", u + 1, d[u]);
		}
	}

	int tt = 1;

}