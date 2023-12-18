
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringBuilder builder = new StringBuilder();
		while (n-- > 0) {
			int a = scanner.nextInt();
			boolean[][] map = new boolean[a + 4][a + 4];
			for (int i = 0; i < a + 4; i++) {
				for (int j = 0; j < a + 4; j++) {
					if (i == 0 || j == 0 || i == a + 3 || j == a + 3) {
						map[i][j] = true;
					}
				}
			}
			int x = 2;
			int y = a + 1;
			int h = 0;
			int[][] dxy = { { 1, 0 }, { 0, -1 }, { -1, 0 }, { 0, 1 } };
			boolean flag = false;
			loop: while (true) {
				if (flag) {
					for (int i = 0; i < 4; i++) {
						if (i == h) {
							continue;
						}
						int py = y + dxy[i][0];
						int px = x + dxy[i][1];
						if (map[py][px]) {
							break loop;
						}
					}
				}
				flag = false;
				map[y][x] = true;
				if (h == 0) {
					if (map[y - 2][x]) {
						x++;
						h = 1;
						flag = true;
					} else {
						y--;
					}
				} else if (h == 1) {
					if (map[y][x + 2]) {
						y++;
						h = 2;
						flag = true;
					} else {
						x++;
					}
				} else if (h == 2) {
					if (map[y + 2][x]) {
						x--;
						h = 3;
						flag = true;
					} else {
						y++;
					}
				} else {
					if (map[y][x - 2]) {
						y--;
						h = 0;
						flag = true;
					} else {
						x--;
					}
				}
			}

			for (int i = 2; i < a + 2; i++) {
				for (int j = 2; j < a + 2; j++) {
					builder.append(map[i][j] ? '#' : ' ');
				}
				builder.append('\n');
			}
			if (n != 0) {
				builder.append('\n');
			}
		}
		System.out.print(builder);
	}
}