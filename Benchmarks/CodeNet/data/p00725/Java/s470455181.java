import java.util.Scanner;

public class Main {
	int dx[] = {0, -1, 1, 0};
	int dy[] = {-1, 0, 0, 1};
	int w, h;

	int solve(int sx, int sy, int gx, int gy, int f[][], int depth) {
		if (depth == 11)
			return 11;
		if (sx == gx && sy == gy)
			return depth;
		int min = 11;
		for (int i = 0; i < 4; i++) {
			int nx, ny;
			nx = sx;
			ny = sy;
			while (0 <= nx && nx < w && 0 <= ny && ny < h && f[ny][nx] != 1) {
				nx += dx[i];
				ny += dy[i];
				if (nx == gx && ny == gy) {
					return depth + 1;
				}
			}
			int desx = nx;
			int desy = ny;
			nx -= dx[i];
			ny -= dy[i];
			if (nx != sx || ny != sy) {
				if (0 <= desx && desx < w && 0 <= desy && desy < h) {
					f[desy][desx] = 0;
				} else {
					continue;
				}
				min = Math.min(min, solve(nx, ny, gx, gy, f, depth + 1));
				if (0 <= desx && desx < w && 0 <= desy && desy < h) {
					f[desy][desx] = 1;
				}
			}
		}
		return min;
	}

	void run () {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}

			int f[][] = new int[h][w];
			int sx, sy, gx, gy;
			sx = sy = gx = gy = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					f[i][j] = sc.nextInt();
					if (f[i][j] == 2) {
						sx = j;
						sy = i;
						f[i][j] = 0;
					}
					if (f[i][j] == 3) {
						gx = j;
						gy = i;
						f[i][j] = 0;
					}
				}
			}
			int tmp = solve(sx, sy, gx, gy, f, 0);
			if (11 <= tmp) tmp = -1;
			System.out.println(tmp);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}