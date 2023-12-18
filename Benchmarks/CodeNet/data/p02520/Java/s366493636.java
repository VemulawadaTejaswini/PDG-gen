import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[][] field;

	public static void main(String[] args) throws Exception {
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] r = new int[26][2];
		int[][] c = new int[26][2];
		boolean[] found = new boolean[26];
		field = new char[M][N];
		for (int i = 0; i < M; ++i) {
			String line = sc.next();
			field[i] = line.toCharArray();
			for (int j = 0; j < N; ++j) {
				if (field[i][j] != '.') {
					int idx = field[i][j] - 'A';
					r[idx][found[idx] ? 1 : 0] = i;
					c[idx][found[idx] ? 1 : 0] = j;
					found[idx] = true;
				}
			}
		}
		int count = 0;
		while (true) {
			boolean removed = false;
			for (int i = 0; i < 26; ++i) {
				if (!found[i]) continue;
				if (reachable(r[i][0], c[i][0], r[i][1], c[i][1])) {
					removed = true;
					field[r[i][0]][c[i][0]] = '.';
					field[r[i][1]][c[i][1]] = '.';
					found[i] = false;
					break;
				}
			}
			if (!removed) {
				break;
			}
			++count;
		}
		System.out.println(count * 2);
	}

	static boolean reachable(int r1, int c1, int r2, int c2) {
		if (Math.abs(r2 - r1) + Math.abs(c2 - c1) == 1) return false;
		boolean ok = true;
		for (int i = r1 + 1; i < r2; ++i) {
			if (field[i][c1] != '.') {
				ok = false;
				break;
			}
		}
		for (int i = Math.min(c1, c2) + 1; i < Math.max(c1, c2); ++i) {
			if (field[r2][i] != '.') {
				ok = false;
				break;
			}
		}
		if (field[r2][c1] != '.' && field[r2][c1] != field[r1][c1]) {
			ok = false;
		}
		if (ok) return true;

		ok = true;
		for (int i = Math.min(c1, c2) + 1; i < Math.max(c1, c2); ++i) {
			if (field[r1][i] != '.') {
				ok = false;
				break;
			}
		}
		for (int i = r1 + 1; i < r2; ++i) {
			if (field[i][c2] != '.') {
				ok = false;
				break;
			}
		}
		if (field[r1][c2] != '.' && field[r1][c2] != field[r1][c1]) {
			ok = false;
		}
		if (ok) return true;

		return false;
	}

}