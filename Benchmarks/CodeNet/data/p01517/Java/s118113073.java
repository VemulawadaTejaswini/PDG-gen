import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] B;
	static boolean[][] g;
	static boolean[] used;
	static HashMap<Long, Integer> memo;
	static long[] mask;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			Country[] cs = new Country[N];
			used = new boolean[N];
			B = new int[N];
			for (int i = 0; i < N; ++i) {
				cs[i] = new Country();
				B[i] = cs[i].b;
			}
			used[0] = true;
			g = new boolean[N][N];
			for (int i = 0; i < N; ++i) {
				for (String o : cs[i].c) {
					for (int j = 0; j < N; ++j) {
						if (o.equals(cs[j].a)) {
							g[i][j] = true;
							if (i == 0) used[j] = true;
							break;
						}
					}
				}
			}
			int ans = B[0];
			for (int i = 0; i < N; ++i) {
				if (!used[i]) ans += solve(i);
			}
			System.out.println(ans);
		}
	}

	static int solve(int cur) {
		int pos = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(cur);
		used[cur] = true;
		while (pos < list.size()) {
			int c = list.get(pos++);
			for (int i = 0; i < N; ++i) {
				if (g[c][i] && !used[i]) {
					used[i] = true;
					list.add(i);
				}
			}
		}
		mask = new long[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			for (int j = 0; j < list.size(); ++j) {
				if (g[list.get(i)][list.get(j)]) {
					mask[i] |= 1L << list.get(j);
				}
			}
			mask[i] |= 1L << list.get(i);
		}
		memo = new HashMap<Long, Integer>();
		return dfs(0, list, 0);
	}

	static int dfs(int pos, ArrayList<Integer> list, long st) {
		if (pos == list.size()) return 0;
		if (pos > 15 && memo.containsKey(((long) pos << 50) | st)) {
			return memo.get(((long) pos << 50) | st);
		}
		int cur = list.get(pos);

		// not use cur
		int ret = dfs(pos + 1, list, st | (1L << cur));

		// use cur
		if ((st & (1L << cur)) == 0) {
			int sum = B[cur];
			sum += dfs(pos + 1, list, st | mask[pos]);
			ret = Math.max(ret, sum);
		}

		if (pos > 15) {
			memo.put(((long) pos << 50) | st, ret);
		}
		return ret;
	}

	static class Country {
		String a;
		int b;
		String[] c;

		Country() {
			a = sc.next();
			b = sc.nextInt();
			int cc = sc.nextInt();
			c = new String[cc];
			for (int i = 0; i < cc; ++i) {
				c[i] = sc.next();
			}
		}
	}
}