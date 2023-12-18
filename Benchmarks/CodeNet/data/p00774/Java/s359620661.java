import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int h = nextInt();
			if (h == 0) {
				break;
			}

			int[][] map = new int[h][5];
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = nextInt();
				}
			}

			int total = 0;
			while (true) {
				int score = 0;
				for (int i = 0; i < map.length; i++) {
					for (int j = 0; j < 3; j++) {
						if (map[i][j] == map[i][j + 1]
								&& map[i][j + 1] == map[i][j + 2]
								&& map[i][j] > 0) {
							int point = map[i][j];
							map[i][j] = 0;
							map[i][j + 1] = 0;
							map[i][j + 2] = 0;
							if (j + 3 < map[i].length && map[i][j + 3] == point) {
								map[i][j + 3] = 0;
								if (j + 4 < map[i].length
										&& map[i][j + 4] == point) {
									score += point * 5;
									map[i][j + 4] = 0;
								} else {
									score += point * 4;
								}
							} else {
								score += point * 3;
							}
						}
					}
				}
				if (score > 0) {
					total += score;
				} else {
					break;
				}

				for (int i = 0; i < 5; i++) {
					int[] column = new int[h];
					int k = 0;
					for (int j = h - 1; j >= 0; j--) {
						if (map[j][i] != 0) {
							column[k] = map[j][i];
							k++;
						}
					}
					for (int j = 0; j < column.length; j++) {
						map[h - j - 1][i] = column[j];
					}
				}
			}
			System.out.println(total);

		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	static char nextChar() {
		try {
			int b = System.in.read();
			while (b != -1 && (b == ' ' || b == '\r' || b == '\n'))
				;
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

}