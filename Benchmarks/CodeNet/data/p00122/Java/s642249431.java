import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			if ((sx | sy) == 0)
				break;
			int[][] map = new int[10][10];
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				map[y][x] = i + 1;
			}
			Queue<Point> q = new LinkedList<Point>();
			q.add(new Point(sx, sy, 0));
			boolean ok = false;
			while (!q.isEmpty()) {
				Point p = q.poll();
				int x = p.x;
				int y = p.y;
				int c = p.c;
				if (c == n + 1) {
					ok = true;
					break;
				}
				if (c != 0) {
					boolean dead = true;
					for (int i = -1; i <= 1; i++) {
						for (int j = -1; j <= 1; j++) {
							int nx = x + j;
							int ny = y + i;
							if (nx >= 0 && ny >= 0 && nx < 10 && ny < 10
									&& map[ny][nx] == c) {
								dead = false;
								i = INF;
								break;
							}
						}
					}
					if (dead)
						continue;
				}
				int dx[] = { 2, 2, 2, 1, 0, -1, -2, -2, -2, -1, 0, 1 };
				int dy[] = { -1, 0, 1, 2, 2, 2, 1, 0, -1, -2, -2, -2 };
				for (int i = 0; i < 12; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx >= 0 && ny >= 0 && nx < 10 && ny < 10) {
						q.add(new Point(nx, ny, c + 1));
					}
				}
			}
			System.out.println(ok ? "OK" : "NA");
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}

class Point {
	int x;
	int y;
	int c;

	Point(int x, int y, int c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
}