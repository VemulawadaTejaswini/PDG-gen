import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int ans;
	static int[] rule;
	static int len;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			char[][] x = new char[5][N];
			for (int i = 0; i < 5; ++i) {
				x[i] = sc.next().toCharArray();
			}
			boolean[] exist = new boolean[N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < 5; ++j) {
					if (x[j][i] == 'X') exist[i] = true;
				}
			}
			int l = 0;
			int r = N - 1;
			while (!exist[l]) {
				++l;
			}
			while (!exist[r]) {
				--r;
			}
			len = r - l + 1;
			for (int i = 0; i < 5; ++i) {
				for (int j = 0; j < len; ++j) {
					x[i][j] = x[i][j + l];
				}
			}
			rule = new int[len+1];
			OUTER: for (int i = 1; i < len; ++i) {
				for (int j = 0; j < 5; ++j) {
					for (int k = i; k < len; ++k) {
						if (x[j][k] == 'X' && x[j][k - i] == 'X') {
							rule[i] = 1;
							continue OUTER;
						}
					}
				}
			}
			int[] used = new int[len * 11];
			for (int i = 0; i < len; ++i) {
				used[i] = rule[i];
			}
			ans = len * 10;
			dfs(0, 0, used);
			System.out.println(ans);
		}
	}

	static void dfs(int pos, int depth, int[] used) {
		if (depth == 9) {
			ans = Math.min(ans, pos + len);
			return;
		}
		if (pos + len + 10 - depth > ans) return; // pruning
		for (int i = 1; i <= len; ++i) {
			if (used[pos + i] > 0) continue;
			for (int j = 1; j < len; ++j) {
				used[pos + i + j] += rule[j];
			}
			dfs(pos + i, depth + 1, used);
			for (int j = 1; j < len; ++j) {
				used[pos + i + j] -= rule[j];
			}
		}
	}

}