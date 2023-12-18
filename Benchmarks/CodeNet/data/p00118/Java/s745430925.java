
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);

	static int height;

	static int width;

	static char[][] map;

	public static void main(String[] args) {

		while (true) {
			height = sc.nextInt();
			width = sc.nextInt();
			if (height == 0 && width == 0) {
				break;
			}
			map = new char[height][];

			for (int i = 0; i < height; i++) {
				map[i] = sc.next().toCharArray();
			}
			int cnt = 0;
			Deque<int[]> s = new ArrayDeque<>();
			for (int i = 0; i < height; i++) {

				for (int j = 0; j < width; j++) {
					char target;
					if (map[i][j] == '@' || map[i][j] == '#' || map[i][j] == '*') {
						s.add(new int[] { i, j });
						target = map[i][j];
					} else {
						continue;
					}
					while (!s.isEmpty()) {
						int[] u = s.poll();

						int[] dx = { 1, 0, 0, -1 };
						int[] dy = { 0, 1, -1, 0 };
						for (int d = 0; d < 4; d++) {
							int nx = u[0] + dx[d];
							int ny = u[1] + dy[d];
							if (0 > nx || nx >= height || 0 > ny || ny >= width) {
								continue;
							}
							if (map[nx][ny] == target) {
								map[nx][ny] = '.';
								s.add(new int[] { nx, ny });
							}

						}

					}
					cnt++;
				}

			}
			System.out.println(cnt);
		}
	}

}