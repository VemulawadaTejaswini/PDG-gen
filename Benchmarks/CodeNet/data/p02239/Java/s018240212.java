import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static final int WHITE = 0;
	static final int GRAY = 1;
	static final int BLACK = 2;

	static int n;
	static int[][] v;
	static int[] color;
	static Queue<Integer> queue;
	static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		v = new int[n][n];
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			u--;
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int vv = sc.nextInt();
				vv--;
				v[u][vv] = 1;
			}
		}
		sc.close();

		color = new int[n];
		for (int i = 0; i < n; i++) {
			color[i] = WHITE;
		}

		d = new int[n];
		for (int i = 0; i < n; i++) {
			d[i] = -1;
		}

		bfs();

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			System.out.print(" ");
			System.out.println(d[i]);
		}
	}

	private static void bfs() {
		queue = new ArrayDeque<>();
		queue.offer(0);
		d[0] = 0;
		color[0] = GRAY;
		while (queue.peek() != null) {
			int visit = queue.poll();
			color[visit] = GRAY;
			for (int i = 0; i < n; i++) {
				if (v[visit][i] == 1 && color[i] == WHITE) {
					queue.offer(i);
					d[i] = d[visit] + 1;
					color[i] = GRAY;
				}
			}
			color[visit] = BLACK;
		}
	}

}