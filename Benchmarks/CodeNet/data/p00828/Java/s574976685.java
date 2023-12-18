import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int[] dx = { 1, 0, 0, 1, 1, 0, 1, -1, 0, 1, -1, 1, 1 };
	int[] dy = { 0, 1, 0, 0, 1, 1, 0, 1, -1, 1, 1, -1, 1 };
	int[] dz = { 0, 0, 1, 1, 0, 1, -1, 0, 1, 1, 1, 1, -1 };

	void run() {
		for (;;) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int p = sc.nextInt();
			if ((n | m | p) == 0) {
				break;
			}

			n += 2;
			int map[][][] = new int[n][n][n];
			String res = "Draw";

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j][0] = -1;
					map[i][j][n - 1] = -1;
					map[i][0][j] = -1;
					map[i][n - 1][j] = -1;
					map[0][i][j] = -1;
					map[n - 1][i][j] = -1;
				}
			}
			boolean ok = false;
			for (int i = 0; i < p; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int z = 1;
				for (;; z++) {
					if (map[x][y][z] == 0) {
						map[x][y][z] = (i & 1) + 1;
						break;
					}
				}

				if (ok) {
					continue;
				}

				for (int j = 0; j < 13; j++) {
					int xx = x;
					int yy = y;
					int zz = z;
					int cnt = 0;
					for (;;) {
						xx -= dx[j];
						yy -= dy[j];
						zz -= dz[j];

						if (map[xx][yy][zz] != (i & 1) + 1) {
							break;
						}
					}
					for (;;) {
						xx += dx[j];
						yy += dy[j];
						zz += dz[j];

						if (map[xx][yy][zz] != (i & 1) + 1) {
							break;
						}
						cnt++;
						if (cnt >= m) {
							break;
						}
					}

					if (cnt >= m) {
						res = (((i & 1) == 1 ? "White" : "Black") + " " + (i + 1));
						j = 1000;
						ok = true;
					}
				}
			}
			System.out.println(res);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}