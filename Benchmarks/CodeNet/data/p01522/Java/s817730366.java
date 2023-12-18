import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		UnionFind uf = new UnionFind(n + 1);
		for (int i = 0; i < k; i++) {
			int m = sc.nextInt();
			int r = sc.nextInt();
			for (int j = 0; j < m - 1; j++) {
				int nr = sc.nextInt();
				uf.unite(r, nr);
				r = nr;
			}
		}
		int R = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < R; i++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (uf.same(p, q)) {
				set.add(p);
				set.add(q);
			}
		}
		System.out.println(set.size());
	}
}

class UnionFind {
	public int par[];
	public int rank[];

	UnionFind(int n) {
		par = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			par[i] = i;
		}
	}

	public int find(int x) {
		if (par[x] == x) {
			return x;
		} else
			return par[x] = find(par[x]);
	}

	public void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return;
		if (rank[x] > rank[y]) {
			par[y] = x;
		} else {
			par[x] = y;
			if (rank[x] == rank[y])
				rank[y]++;
		}
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}