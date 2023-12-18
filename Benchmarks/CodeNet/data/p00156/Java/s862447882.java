import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;
	int n;
	int m;
	char[][] map;
	int[][] visited;
	int dx[] = { 0, 1, 0, -1 };
	int dy[] = { 1, 0, -1, 0 };
	int min = INF;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0)
				break;
			map = new char[m][n];
			visited = new int[m][n];
			for (int i = 0; i < m; i++) {
				map[i] = sc.next().toCharArray();
				Arrays.fill(visited[i], INF);
			}
			if (n <= 2 || m <= 2) {
				System.out.println(0);
				continue;
			}
			int sx = 0;
			int sy = 0;
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == '&') {
						sx = j;
						sy = i;
						i = INF;
						break;
					}
				}
			}
			System.out.println(solve(new Point(sx, sy), 0));
		}
	}

	int solve(Point pos, int c) {

		int x = pos.x;
		int y = pos.y;
		if (x < 0 || y < 0 || x >= n || y >= m) {
			return min = c;
		}
		if (visited[y][x] <= c)
			return INF;
		visited[y][x] = c;
		if (min < c) {
			return INF;
		}
		int res = INF;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			res = Math.min(res,
					solve(new Point(nx, ny), c + ((map[y][x] == '#') ? 1 : 0)));
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}
}