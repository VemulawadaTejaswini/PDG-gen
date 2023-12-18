
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
		while (true) {
			boolean flag = false;
			for (int i = 0; i < 2; i++) {
				char my, en;
				if (i == 0) {
					my = 'o';
					en = 'x';
				} else {
					my = 'x';
					en = 'o';
				}
				int cnt = 0;
				int cx = 0, cy = 0, dr = 0;
				for (int y = 0; y < 8; y++)
					for (int x = 0; x < 8; x++) {
						int hy = i == 0 ? y : 7 - y;
						int hx = i == 0 ? x : 7 - x;
						if (map[hy][hx] != '.')
							continue;
						int cc = 0;
						int cdr = 0;
						for (int j = 0; j < 8; j++) {
							int c = 0;
							while (true) {
								int ny = hy + dy[j] * (c + 1);
								int nx = hx + dx[j] * (c + 1);
								if (nx < 0 || 8 <= nx || ny < 0 || 8 <= ny)
									break;
								if (map[ny][nx] == en) {
									c++;
									continue;
								} else if (map[ny][nx] == my && c != 0) {
									cc += c;
									cdr |= (1 << j);
								}
								break;

							}
						}
						if (cc <= cnt)
							continue;
						cx = hx;
						cy = hy;
						dr = cdr;
						cnt = cc;
					}
				if (cnt > 0) {
					flag = true;
					map[cy][cx] = my;
					for (int j = 0; j < 8; j++) {
						if ((dr & (1 << j)) != 0) {
							for (int k = 1; true; k++) {
								int nx = cx + dx[j] * k;
								int ny = cy + dy[j] * k;
								if (map[ny][nx] == my)
									break;
								map[ny][nx] = my;
							}
						}
					}
				}

			}
			if (!flag)
				break;

		}
		for (int i = 0; i < 8; i++)
			System.out.println(String.valueOf(map[i]));
	}
}