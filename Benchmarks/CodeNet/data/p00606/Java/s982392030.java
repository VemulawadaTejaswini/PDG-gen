import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final int INF = 1 << 28;
	int s;
	int t;
	int b;
	double dp[][];

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			// n
			// s t b
			//
			// n はバッテリーの残ポイント数を示す整数である。 s, t, b
			// はそれぞれ、最初にロボットがいる部屋、充電器のある部屋、倉庫として使っている部屋を示す大文字のアルファベットである。
			int n = sc.nextInt();
			if (n == 0)
				break;

			s = sc.next().charAt(0) - 'A';
			t = sc.next().charAt(0) - 'A';
			b = sc.next().charAt(0) - 'A';
			int x = s % 3;
			int y = (s - x) / 3;
			dp = new double[n + 1][9];
			for (int i = 0; i <= n; i++) {
				Arrays.fill(dp[i], -1);
			}
			double ans = solve(n, new Point(x, y));
			System.out.printf("%.8f\n", ans);
		}
	}

	double solve(int rest, Point pos) {
		int x = pos.x;
		int y = pos.y;
		if (dp[rest][x + 3 * y] >= 0) {
			return dp[rest][x + 3 * y];
		}
		double res = 0;
		if (rest == 0) {
			if (x + 3 * y == t) {
				res = 1.0;
			} else
				res = 0.0;
		} else {
			int dx[] = { 0, 1, 0, -1 };
			int dy[] = { 1, 0, -1, 0 };
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || ny < 0 || nx > 2 || ny > 2 || nx + 3 * ny == b) {
					res += 1.0 / 4 * solve(rest - 1, pos);
				} else {
					res += 1.0 / 4 * solve(rest - 1, new Point(nx, ny));
				}
			}
		}
		return dp[rest][x + 3 * y] = res;
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

}