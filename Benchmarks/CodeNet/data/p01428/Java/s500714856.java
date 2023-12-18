
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] dy = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dx = { -1, 0, 1, -1, 1, -1, 0, 1 };
		char[][] map = new char[8][8];
		for (int i = 0; i < 8; i++)
			map[i] = scanner.next().toCharArray();
		char my, en;
		int u = 0;
		int flag = 0;
		while (true) {
			if (u == 0) {
				my = 'o';
				en = 'x';
			} else {
				my = 'x';
				en = 'o';
			}
			int cnt = 0, ey = 0, ex = 0, dir = 0;
			for (int y = 0; y < 8; y++)
				for (int x = 0; x < 8; x++) {
					int hy = u == 0 ? y : 7 - y;
					int hx = u == 0 ? x : 7 - x;
					if (map[hy][hx] != '.')
						continue;
					int cc = 0, ndir = 0;
					for (int i = 0; i < 8; i++) {
						int c = 0;
						while (true) {
							int ny = hy + dy[i] * (c + 1);
							int nx = hx + dx[i] * (c + 1);
							if (!isOK(ny, nx))
								break;
							if (map[ny][nx] == en) {
								c++;
								continue;
							} else if (map[ny][nx] == my && c != 0) {
								cc += c;
								ndir |= (1 << i);
							}
							break;
						}
					}
					if (cnt >= cc)
						continue;
					cnt = cc;
					ey = hy;
					ex = hx;
					dir = ndir;
				}
			u = 1 - u;
			if (cnt == 0) {
				flag++;
				if (flag == 2)
					break;
			} else {
				map[ey][ex] = my;
				for (int i = 0; i < 8; i++) {
					if (((dir >> i) & 1) == 0)
						continue;
					int k = 1;
					while (true) {
						int ny = ey + dy[i] * k;
						int nx = ex + dx[i] * k;
						if (map[ny][nx] == my)
							break;
						map[ny][nx] = my;
						k++;
					}
				}
			}

		}
		for (char[] ans : map)
			System.out.println(ans);

	}

	private boolean isOK(int ny, int nx) {
		return 0 <= ny && ny < 8 && 0 <= nx && nx < 8;
	}
}