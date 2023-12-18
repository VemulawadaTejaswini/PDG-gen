import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	int w;
	int h;
	int[][] s;
	int[][][] visited;

	int cs[];
	int[] dx = { 1, 0, -1, 0 };
	int[] dy = { 0, 1, 0, -1 };
	final int INF = 1 << 29;

	boolean init() {
		w = sc.nextInt();
		h = sc.nextInt();
		if ((h | w) == 0)
			return false;
		s = new int[w][h];
		visited = new int[w][h][4];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				Arrays.fill(visited[i][j], INF);
			}
		}
		cs = new int[4];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				s[j][i] = sc.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			cs[i] = sc.nextInt();
		}
		return true;
	}

	void run() {
		while (init()) {
			Queue<Node> q = new LinkedList<Node>();
			q.add(new Node(0, 0, 0, 0));
			int ans = INF;
			while (!q.isEmpty()) {
				Node n = q.poll();
				int x = n.x;
				int y = n.y;
				// System.out.println(n);
				int d = n.d;
				int c = n.c;
				if (visited[x][y][d] <= c)
					continue;
				visited[x][y][d] = c;
				if (x == w - 1 && y == h - 1) {
					ans = Math.min(ans, c);
					continue;
				}
				for (int i = 0; i < 4; i++) {
					int nx = x + dx[(d + i) % 4];
					int ny = y + dy[(d + i) % 4];
					if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
						continue;
					}
					Node nn = new Node(nx, ny, (d + i) % 4, c + cs[i]);
					q.add(nn);
				}
				if (s[x][y] == 4)
					continue;
				int dd = (d + s[x][y]) % 4;
				int nx = x + dx[dd];
				int ny = y + dy[dd];
				if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
					continue;
				}
				q.add(new Node(nx, ny, dd, c));
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();

	}
}

class Node {
	public int x;
	public int y;
	public int d;
	public int c;

	Node(int x, int y, int d, int c) {
		this.x = x;
		this.y = y;
		this.d = d;
		this.c = c;
	}

	public String toString() {
		return "( " + x + " " + y + " " + d + " " + c + ") ";
	}

}