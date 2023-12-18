import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	int w;
	int h;
	int[][] s;
	int[][][] dis;

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
		dis = new int[w][h][4];
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				Arrays.fill(dis[i][j], INF);
			}
		}
		cs = new int[5];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				s[j][i] = sc.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			cs[i] = sc.nextInt();
		}
		cs[4] = 0;
		return true;
	}

	void run() {
		while (init()) {
			dis[0][0][0] = 0;
			while (true) {
				boolean update = false;
				for (int x = 0; x < w; x++) {
					for (int y = 0; y < h; y++) {
						for (int d = 0; d < 4; d++) {
							// コマンド0,1,2,3orパネルの命令
							for (int i = 0; i < 5; i++) {
								if (s[x][y] == 4 && i == 4)
									continue;
								int nd = ((i != 4 ? i : s[x][y]) + d) % 4;
								int nx = x + dx[nd];
								int ny = y + dy[nd];
								if (nx < 0 || ny < 0 || nx >= w || ny >= h)
									continue;
								if (dis[x][y][d] != INF
										&& dis[nx][ny][nd] > dis[x][y][d]
												+ cs[i]) {
									dis[nx][ny][nd] = dis[x][y][d] + cs[i];
									update = true;
								}
							}
						}
					}
				}
				if (!update)
					break;
			}
			System.out.println(Math.min(dis[w - 1][h - 1][1],
					dis[w - 1][h - 1][0]));
		}
	}

	public static void main(String[] args) {
		new Main().run();

	}
}