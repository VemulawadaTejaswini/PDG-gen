import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[][] domino = new boolean[7][7];
	static int[] count = new int[7];
	static int N;

	public static void main(String[] args) throws Exception {
		while (sc.hasNext()) {
			N = sc.nextInt();
			for (boolean[] a : domino) {
				Arrays.fill(a, false);
			}
			Arrays.fill(count, 0);
			for (int i = 0; i < N; ++i) {
				String v = sc.next();
				int f = v.charAt(0) - '0';
				int s = v.charAt(1) - '0';
				domino[f][s] = true;
				++count[f];
				++count[s];
			}
			System.out.println(solve() ? "Yes" : "No");
		}
	}

	static boolean solve() {
		for (int i = 0; i < 7; ++i) {
			if (solve(i, 0)) {
				return true;
			}
		}
		return false;
	}

	static boolean solve(int first, int depth) {
		if (depth == N) return true;
		if (count[first] == 0) return false;
		int odd = 0;
		for (int i = 0; i < 7; ++i) {
			if (count[i] % 2 != 0) ++odd;
		}
		if (!(odd == 0 || (odd == 2 && count[first] % 2 != 0))) return false;
		for (int i = 0; i < 7; ++i) {
			int r = Math.min(i, first);
			int c = Math.max(i, first);
			if (domino[r][c]) {
				domino[r][c] = false;
				--count[r];
				--count[c];
//				System.out.println(r + " " + c + " " + depth);
				if (solve(i, depth + 1)) return true;
				++count[c];
				++count[r];
				domino[r][c] = true;
			}
		}
		return false;
	}
}