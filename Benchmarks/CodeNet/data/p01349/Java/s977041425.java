import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int h, w, n;
	char[][] map, tempMap;
	boolean[][] deleteMap;

	void dropBlock() {
		for (int ii = 0; ii <= h; ii++) {
			for (int i = h; i >= 2; i--) {
				for (int j = 1; j <= w; j++) {
					if (tempMap[i][j] == '.' && tempMap[i - 1][j] != '.') {
						tempMap[i][j] = tempMap[i - 1][j];
						tempMap[i - 1][j] = '.';
					}
				}
			}
		}
	}

	void addDeleteTarget(int y, int x, int dir) {
		if (dir == 0) {
			for (int i = 0; i < n; i++) {
				deleteMap[y][x + i] = true;
			}
		} else {
			for (int i = 0; i < n; i++) {
				deleteMap[y + i][x] = true;
			}
		}
	}

	boolean blockDeleted() {
		boolean blockLeft = false;
		boolean deletable = false;

		/*
		 * for (int i = 1; i <= h; i++) { for (int j = 1; j <= w; j++) {
		 * System.out.print(tempMap[i][j]); } System.out.println(); }
		 * System.out.println();
		 */

		for (int i = 1; i <= h; i++) {
			Arrays.fill(deleteMap[i], false);
		}

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				char next = tempMap[i][j];
				if (next == '.')
					continue;
				else
					blockLeft = true;

				for (int k = 1; k < n; k++) {
					if (tempMap[i][j + k] != next)
						break;
					else if (k == n - 1) {
						deletable = true;
						addDeleteTarget(i, j, 0);
					}
				}

				for (int k = 1; k < n; k++) {
					if (tempMap[i + k][j] != next)
						break;
					else if (k == n - 1) {
						deletable = true;
						addDeleteTarget(i, j, 1);
					}
				}
			}
		}
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (deleteMap[i][j])
					tempMap[i][j] = '.';
			}
		}

		if (blockLeft) {
			if (deletable) {
				dropBlock();
				return blockDeleted();
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

	void swap(int y, int x, int yy, int xx) {
		char temp = map[y][x];
		map[y][x] = map[y + yy][x + xx];
		map[y + yy][x + xx] = temp;
	}

	void copyMap() {
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				tempMap[i][j] = map[i][j];
			}
		}
	}

	public void run() {
		boolean flag = false;
		Scanner in = new Scanner(System.in);
		h = in.nextInt();
		w = in.nextInt();
		n = in.nextInt();
		map = new char[h + 2][w + 2];
		tempMap = new char[h + 2][w + 2];
		deleteMap = new boolean[h + 2][w + 2];

		for (int i = 0; i <= h + 1; i++) {
			String s = "";
			if (i != 0 && i != h + 1)
				s = in.next();
			for (int j = 0; j <= w + 1; j++) {
				if (i == 0 || i == h + 1 || j == 0 || j == w + 1)
					map[i][j] = 0;
				else
					map[i][j] = s.charAt(j - 1);
			}
		}
		end: for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {

				swap(i, j, 0, 1);
				copyMap();
				if (blockDeleted()) {
					flag = true;
				}
				swap(i, j, 0, 1);

				swap(i, j, 1, 0);
				copyMap();
				if (blockDeleted()) {
					flag = true;
				}
				swap(i, j, 1, 0);

				if (flag)
					break end;
			}
		}

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	public static void main(String[] args) {
		new Main().run();
	}

}