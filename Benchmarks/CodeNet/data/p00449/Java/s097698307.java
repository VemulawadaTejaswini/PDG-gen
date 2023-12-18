import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Boat Travel
 * JOI 7th, Pre 6
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, k;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			k = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | k) == 0) break;

			//
			DijkstraA D = new DijkstraA(n);
			UnionFind U = new UnionFind(n);

			//
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < k; i++) {
				words = br.readLine().split(" ");
				if (words[0].equals("0")) {
					int a, b;
					a = parseInt(words[1]);
					b = parseInt(words[2]);
					//
					if (U.same(a, b)) {
						sb.append(D.solve(a, b)).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
				} else {
					int c, d, e;
					c = parseInt(words[1]);
					d = parseInt(words[2]);
					e = parseInt(words[3]);
					//
					D.update(c, d, e);
					U.unite(c, d);
				}
			}

			System.out.print(sb.toString());
		}
	}
}

class DijkstraA {

	static final int INF = 1 << 29;

	int N;
	int[][] adj;
	int[] min;
	boolean[] used;

	DijkstraA(int n) {
		N = n;
		adj = new int[N + 1][N + 1];
		for (int i = 0; i < adj.length; i++) {
			Arrays.fill(adj[i], INF);
		}
		min = new int[N + 1];
		used = new boolean[N + 1];
	}

	void update(int c, int d, int e) {
		if (e < adj[c][d]) {
			adj[c][d] = adj[d][c] = e;
		}
	}

	int solve(int a, int b) {

		Arrays.fill(min, INF);
		Arrays.fill(used, false);

		min[a] = 0;

		while (true) {
			int v = -1;
			for (int u = 1; u <= N; u++) {
				if (!used[u] && (v == -1 || min[u] < min[v])) v = u;
			}
			if (v == -1) break;
			//
			used[v] = true;
			for (int u = 1; u <= N; u++) {
				min[u] = Math.min(min[u], min[v] + adj[v][u]);
			}
		}

		return min[b];
	}
}


class UnionFind {

	int[] par;
	int[] rank;

	UnionFind(int n) {
		par = new int[n + 1];
		for (int i = 0; i < par.length; i++) par[i] = i;
		rank = new int[n + 1];
	}

	int find(int a) {
		if (par[a] == a) {
			return a;
		} else {
			return par[a] = find(par[a]);
		}
	}

	void unite(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b) return;

		if (rank[a] < rank[b]) {
			par[a] = b;
		} else {
			par[b] = a;
			if (rank[a] == rank[b]) rank[a]++;
		}
	}

	boolean same(int a, int b) {
		return find(a) == find(b);
	}
}