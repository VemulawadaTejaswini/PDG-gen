package tester;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	double[][] p = new double[2][6];

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] w = new long[n];
		for (int i = 0; i < n; ++i) {
			w[i] = sc.nextLong();
		}
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i)
			g[i] = new ArrayList<>();
		int[] deg = new int[n];
		for (int i = 0; i < m; ++i) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			g[u].add(v);
			g[v].add(u);
			++deg[u];
			++deg[v];
		}

		long[] f = new long[n];

		ArrayDeque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; ++i) {
			if (deg[i] == 1 && i != 0) {
				dq.add(i);
			}
		}

		long ans = 0;
		while (!dq.isEmpty()) {
			int v = dq.pollFirst();
			for (int dst : g[v]) {
				if (deg[dst] == 0)
					continue;
				f[dst] = Math.max(f[dst], f[v] + w[v]);
				ans = Math.max(ans, f[dst]);
				--deg[dst];
				--deg[v];
				if (dst != 0 && deg[dst] == 1) {
					dq.addLast(dst);
				}
			}
		}

		for (int i = 0; i < n; ++i) {
			if (i == 0 || deg[i] > 0)
				ans += w[i];
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
