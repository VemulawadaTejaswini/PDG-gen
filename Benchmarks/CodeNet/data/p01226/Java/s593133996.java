
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int t = sc.nextInt();
		for (int tc = 0; tc < t; tc++) {
			if (tc != 0) {
				System.out.println();
			}
			int h = sc.nextInt() + 2;
			int w = sc.nextInt() + 2;

			String ext = "###########";
			ext = ext + ext + ext + ext + ext;

			char map[][] = new char[h][w];

			int dirc = -1;
			int x = -1;
			int y = -1;

			for (int i = 0; i < h; i++) {
				String buffer = "";
				if (i == 0 || i == h - 1) {
					buffer = ext;
				} else {
					buffer = "#" + sc.next() + "#";
				}
				for (int j = 0; j < w; j++) {
					map[i][j] = buffer.charAt(j);
					if ("^v<>".indexOf(map[i][j]) != -1) {
						dirc = "^v<>".indexOf(map[i][j]);
						x = i;
						y = j;
						map[i][j] = '.';
					}
				}
			}

			int sn = sc.nextInt();
			String sec = sc.next();
			int dx[] = { -1, 1, 0, 0 };
			int dy[] = { 0, 0, -1, 1 };

			String move = "UDLR";
			for (int i = 0; i < sn; i++) {
				char com = sec.charAt(i);
				if (move.indexOf(com) != -1) {
					dirc = move.indexOf(com);
					if (map[x + dx[dirc]][y + dy[dirc]] == '.') {
						x += dx[dirc];
						y += dy[dirc];
					}
				} else {
					int nx = x;
					int ny = y;
					String kabe = "#*";
					for (; kabe.indexOf(map[nx][ny]) == -1;) { // dangan
						nx += dx[dirc];
						ny += dy[dirc];
					}
					if (kabe.indexOf(map[nx][ny]) == 1) {
						map[nx][ny] = '.';
					}
				}
			}

			map[x][y] = "^v<>".toCharArray()[dirc];

			for (int i = 1; i < h - 1; i++) {
				for (int j = 1; j < w - 1; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}