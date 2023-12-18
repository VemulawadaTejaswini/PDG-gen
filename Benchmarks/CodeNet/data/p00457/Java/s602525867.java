import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] v;

	static int solve(int pos, int c) {
		int tmp = v[pos];
		v[pos] = c;
		int up = pos;
		int dp = pos;
		int count = 0;
		while (0 <= up && dp < v.length && v[up] == v[dp]) {
			int color = v[up];
			int num = up == dp ? -1 : 0;
			while (0 <= up && v[up] == color) {
				--up;
				++num;
			}
			while (dp < v.length && v[dp] == color) {
				++dp;
				++num;
			}
			if (num < 4) break;
			count += num;
		}
		v[pos] = tmp;
		return count;
	}

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			v = new int[N];
			for (int i = 0; i < N; ++i) {
				v[i] = sc.next().charAt(0) - '0';
			}
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				int u = i == 0 ? -1 : v[i - 1];
				int d = i == N - 1 ? -1 : v[i + 1];
				if (u != -1 && u != v[i]) {
					ans = Math.max(ans, solve(i, u));
				}
				if (d != -1 && d != v[i] && u != d) {
					ans = Math.max(ans, solve(i, d));
				}
			}
			System.out.println(N - ans);
		}
	}
}