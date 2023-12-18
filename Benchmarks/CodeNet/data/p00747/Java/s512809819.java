import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int w = nextInt();
			if (w == 0) {
				break;
			}

			int h = nextInt();

			int[][] map = new int[2 * h - 1][2 * w - 1];
			for (int i = 0; i < map.length; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < w - 1; j++) {
						map[i][2 * j + 1] = nextInt();
					}
				} else {
					for (int j = 0; j < w; j++) {
						map[i][2 * j] = nextInt();
					}
				}
			}

			for (int i = 0; i < map.length; i++) {
				for (int j = 1; j < map[i].length - 1; j++) {
					if (i % 2 == 1 && map[i][j - 1] == 1 && map[i][j + 1] == 1) {
						map[i][j] = 1;
					}
				}
			}
			for (int i = 0; i < map[0].length; i++) {
				for (int j = 1; j < map.length - 1; j++) {
					if (i % 2 == 1 && map[j - 1][i] == 1 && map[j + 1][i] == 1) {
						map[j][i] = 1;
					}

				}
			}

			int[][] dp = new int[h][w];
			for (int i = 0; i < dp.length; i++) {
				for (int j = 0; j < dp[i].length; j++) {
					dp[i][j] = Integer.MAX_VALUE;
				}
			}
			dp[0][0] = 1;

			Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
			Integer[] first = { 0, 0 };
			deque.add(first);
			map[0][0] = 1;

			int[] dir = { -1, 1 };

			while (deque.size() > 0) {
				Integer[] poll = deque.poll();
				for (int i = 0; i < 2; i++) {
					for (int j = 0; j < 2; j++) {
						if (poll[j] + dir[i] * 2 >= 0) {
							if (j == 0 && poll[j] + dir[i] * 2 < map.length
									&& map[poll[j] + dir[i]][poll[1]] == 0
									&& map[poll[j] + dir[i] * 2][poll[1]] == 0) {
								map[poll[j] + dir[i]][poll[1]] = 1;
								map[poll[j] + dir[i] * 2][poll[1]] = 1;
								Integer[] push = { poll[j] + dir[i] * 2,
										poll[1] };
								deque.add(push);
								dp[poll[j] / 2 + dir[i]][poll[1] / 2] = Math
										.min(dp[poll[j] / 2 + dir[i]][poll[1] / 2],
												dp[poll[j] / 2][poll[1] / 2] + 1);
							} else if (j == 1
									&& poll[j] + dir[i] * 2 < map[0].length
									&& map[poll[0]][poll[j] + dir[i]] == 0
									&& map[poll[0]][poll[j] + dir[i] * 2] == 0) {
								map[poll[0]][poll[j] + dir[i]] = 1;
								map[poll[0]][poll[j] + dir[i] * 2] = 1;
								Integer[] push = { poll[0],
										poll[j] + dir[i] * 2 };
								deque.add(push);
								dp[poll[0] / 2][poll[j] / 2 + dir[i]] = Math
										.min(dp[poll[0] / 2][poll[j] / 2
												+ dir[i]],
												dp[poll[0] / 2][poll[j] / 2] + 1);
							}

						}
					}
				}

			}
			//
			// System.out.println();
			// for (int i = 0; i < dp.length; i++) {
			// for (int j = 0; j < dp[i].length; j++) {
			// if (dp[i][j] > 99) {
			// dp[i][j] = 0;
			// }
			// System.out.print(dp[i][j] + " ");
			// if (dp[i][j] < 10) {
			// System.out.print(" ");
			// }
			// }
			// System.out.println();
			// }

			int ret = dp[h - 1][w - 1];
			if (ret > h * w) {
				ret = 0;
			}
			System.out.println(ret);

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