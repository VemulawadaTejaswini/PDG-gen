import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	private static char[][] field, clone;

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int height = scanner.nextInt();
		int width = scanner.nextInt();
		int n = scanner.nextInt();

		field = new char[height][width];// フィールド状態
		for (int i = 0; i < field.length; i++) {
			String line = scanner.next();
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = line.charAt(j);
			}
		}
		scanner.close();

		clone = new char[height][width];// フィールド状態
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < clone[i].length; j++) {
				if (i + 1 < field.length) {
					copy();
					exchange(i, j, i + 1, j);
					int rest = height * width;
					while (true) {
						fall();
						vanish(n);
						int check = check();
						if (check == 0) {
							System.out.println("YES");
							return;
						} else if (check == rest) {
							break;
						} else {
							rest = check;
						}
					}

				}

				if (j + 1 < field[i].length) {
					copy();
					exchange(i, j, i, j + 1);
					int rest = height * width;
					while (true) {
						fall();
						vanish(n);
						int check = check();
						if (check == 0) {
							System.out.println("YES");
							return;
						} else if (check == rest) {
							break;
						} else {
							rest = check;
						}
					}
				}
			}
		}

		System.out.println("NO");
		return;

	}

	static void copy() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				clone[i][j] = field[i][j];
			}
		}
	}

	static boolean vanish(int n) {
		// 消えるところをリストアップ
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();

		// まずは横のつながり
		for (int i = 0; i < clone.length; i++) {
			int start = -1;
			for (int j = 1; j <= clone[i].length; j++) {
				if (clone[i][j - 1] == '.') {
					continue;
				}
				if (start == -1) {
					if (j < clone[i].length && clone[i][j] == clone[i][j - 1]) {
						start = j - 1;
					}
				} else if (j == clone[i].length
						|| clone[i][j] != clone[i][j - 1]) {
					if (j - start >= n) {
						for (int j2 = start; j2 < j; j2++) {
							Integer[] push = { i, j2 };
							list.add(push);
						}
					}
					start = -1;
				}

			}
		}

		// 縦のつながり
		for (int col = 0; col < clone[0].length; col++) {
			int start = -1;
			for (int row = 1; row <= clone.length; row++) {
				if (start == -1) {
					if (row < clone.length
							&& clone[row][col] == clone[row - 1][col]) {
						start = row - 1;
					}
				} else if (row == clone.length
						|| clone[row][col] != clone[row - 1][col]) {
					if (row - start >= n) {
						for (int i = start; i < row; i++) {
							Integer[] push = { i, col };
							list.add(push);
						}
					}
					start = -1;
				}

			}

		}

		for (Integer[] integers : list) {
			int i = integers[0];
			int j = integers[1];
			clone[i][j] = '.';
		}

		return list.size() > 0;

	}

	static void fall() {
		for (int col = 0; col < clone[0].length; col++) {
			Deque<Character> deque = new ArrayDeque<Character>();
			for (int i = clone.length - 1; i >= 0; i--) {
				if (clone[i][col] != '.') {
					deque.add(clone[i][col]);
				}
			}
			for (int i = clone.length - 1; i >= 0; i--) {
				if (!deque.isEmpty()) {
					clone[i][col] = deque.pollFirst();
				} else {
					clone[i][col] = '.';
				}
			}
		}
	}

	static void exchange(int p, int q, int r, int s) {
		char tmp = clone[p][q];
		clone[p][q] = clone[r][s];
		clone[r][s] = tmp;
	}

	static int check() {
		int rest = 0;
		// 残りブロックの数を返す
		for (int i = 0; i < clone.length; i++) {
			for (int j = 0; j < clone[i].length; j++) {
				if (clone[i][j] != '.') {
					rest++;
				}
			}
		}
		return rest;
	}

}