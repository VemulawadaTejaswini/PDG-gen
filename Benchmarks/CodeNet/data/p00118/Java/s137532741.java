import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);

	static int h, w;

	static char[][] map;

	public static void main(String[] args) {

		while (true) {
			h = s.nextInt();
			w = s.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			map = new char[h][];

			for (int i = 0; i < h; i++) {
				map[i] = s.next().toCharArray();
			}
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == '#' || map[i][j] == '*' || map[i][j] == '@') {

						bfs(i, j, map[i][j]);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	private static void bfs(int i, int j, char target) {

		map[i][j] = '.';

		int[] dx = { 1, 0, 0, -1 };
		int[] dy = { 0, 1, -1, 0 };
		for (int d = 0; d < 4; d++) {
			int nx = i + dx[d];
			int ny = j + dy[d];
			if (0 > nx || nx >= h || 0 > ny || ny >= w) {
				continue;
			}
			if (map[nx][ny] == target) {
				bfs(nx, ny, map[nx][ny]);
			}
		}
	}
}