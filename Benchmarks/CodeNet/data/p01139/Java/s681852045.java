import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] dir = { -1, 1 };
		while (true) {
			int width = scanner.nextInt();// 本数
			if (width == 0) {
				break;
			}
			int height = scanner.nextInt();
			int[][] field = new int[height][width];
			for (int i = 0; i < field.length; i++) {
				/*
				 * 何もない土地は0 使用済みの土地は1 黒い杭は2 白い杭は3
				 */
				String line = scanner.next();
				for (int j = 0; j < field[i].length; j++) {
					char letter = line.charAt(j);
					if (letter == 'B') {
						field[i][j] = 2;
					} else if (letter == 'W') {
						field[i][j] = 3;
					}
				}
			}

			int black = 0, white = 0;
			Deque<Integer[]> deque = new ArrayDeque<Integer[]>();
			for (int i = 0; i < field.length; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if (field[i][j] == 0) {
						Integer[] push = { i, j };
						field[i][j] = 1;
						deque.add(push);
					}
					int sum = 0;
					boolean is_black = false, is_white = false;
					while (deque.size() > 0) {
						Integer[] poll = deque.poll();
						sum++;
						for (int k = 0; k < dir.length; k++) {
							if (poll[0] + dir[k] >= 0
									&& poll[0] + dir[k] < field.length) {
								switch (field[poll[0] + dir[k]][poll[1]]) {
								case 0:
									Integer[] push = { poll[0] + dir[k],
											poll[1] };
									field[poll[0] + dir[k]][poll[1]] = 1;
									deque.add(push);
									break;
								case 2:
									is_black = true;
									break;
								case 3:
									is_white = true;
									break;
								default:
									break;
								}
							}

							if (poll[1] + dir[k] >= 0
									&& poll[1] + dir[k] < field[0].length) {
								switch (field[poll[0]][poll[1] + dir[k]]) {
								case 0:
									Integer[] push = { poll[0],
											poll[1] + dir[k] };
									field[poll[0]][poll[1] + dir[k]] = 1;
									deque.add(push);
									break;
								case 2:
									is_black = true;
									break;
								case 3:
									is_white = true;
									break;
								default:
									break;
								}
							}
						}
					}

					if (is_black && !is_white) {
						black += sum;
					} else if (is_white && !is_black) {
						white += sum;
					}

					// for (int k = 0; k < field.length; k++) {
					// for (int k2 = 0; k2 < field[k].length; k2++) {
					// System.out.print(field[k][k2]);
					// }
					// System.out.println();
					// }
					// System.out.println();
					// System.out.println(black + " " + white);
				}
			}
			System.out.println(black + " " + white);
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