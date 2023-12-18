import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int INF = 1 << 28;
	double EPS = 1e-10;

	public static void main(String[] args) {
		new Main().run();
	}

	int w, h;
	char s[][];
	boolean visited[][][][];

	void run() {
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0)
				break;
			s = new char[h][w];
			visited = new boolean[2][w][h][w * h * 9];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					s[i][j] = sc.next().charAt(0);
				}
			}

			Queue<Node> q = new LinkedList<Node>();
			for (int i = 0; i < w; i++) {
				if (s[h - 1][i] == 'S') {
					for (int j = 0; j < 2; j++) {
						q.add(new Node(i, h - 1, 0, j));
					}
				}
			}
			int ans = INF;
			boolean goal = false;
			while (!q.isEmpty()) {
				Node n = q.poll();
				int x = n.x;
				int y = n.y;
				int t = n.t;
				if (t >= w * h * 9)
					continue;
				int leg = n.leg;
				// System.out.println(x + " " + y + " " + t + " " + leg);
				if (visited[leg][x][y][t]) {
					continue;
				}
				visited[leg][x][y][t] = true;
				if (t > ans)
					continue;
				if (s[y][x] == 'T') {
					ans = Math.min(ans, t);
					goal = true;
					continue;
				}
				int dx[][] = new int[2][9];
				int dy[][] = new int[2][9];
				dx[0] = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 1 };
				dy[0] = new int[] { -2, -1, -1, 0, 0, 0, 1, 1, 2 };
				dx[1] = new int[] { -1, -1, -2, -1, -2, -3, -1, -2, -1 };
				dy[1] = new int[] { -2, -1, -1, 0, 0, 0, 1, 1, 2 };
				for (int i = 0; i < 9; i++) {
					int nx = x + dx[leg][i];
					int ny = y + dy[leg][i];
					if (nx < 0 || ny < 0 || nx >= w || ny >= h
							|| s[ny][nx] == 'X')
						continue;
					int nt = t;
					if (s[ny][nx] >= '1' && s[ny][nx] <= '9') {
						nt += s[ny][nx] - '0';
					}
					q.add(new Node(nx, ny, nt, leg ^ 1));
				}
			}
			System.out.println(goal ? ans : -1);
		}
	}
}

class Node {
	int x;
	int y;
	int t;
	int leg; // left 0 right 1

	Node(int x, int y, int t, int leg) {
		this.x = x;
		this.y = y;
		this.t = t;
		this.leg = leg;
	}
}