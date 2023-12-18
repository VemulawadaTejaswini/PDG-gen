import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			Edge[] es = new Edge[m];
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int d = sc.nextInt();
				es[i] = new Edge(a, b, d);
			}
			Arrays.sort(es, new Comparator<Edge>() {
				public int compare(Edge x, Edge y) {
					return x.d - y.d;
				}
			});
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < m; i++) {
				int min = Integer.MAX_VALUE;
				int max = 0;
				UnionFind uf = new UnionFind(n);
				for (int j = i; j < m; j++) {
					int a = es[j].a;
					int b = es[j].b;
					int d = es[j].d;
					if (!uf.same(a, b)) {
						uf.unite(a, b);
						min = Math.min(min, d);
						max = Math.max(max, d);
						//System.out.println(max + " " + min);
					}
				}
				if (uf.all())
					ans = Math.min(ans, max - min);
			}
			System.out.println(ans != Integer.MAX_VALUE ? ans : -1);
		}
	}
}

class Edge {
	public int a;
	public int b;
	public int d;

	Edge(int a, int b, int d) {
		this.a = a;
		this.b = b;
		this.d = d;
	}

	public String toString() {
		return this.a + " " + this.b + " " + this.d;
	}
}

class UnionFind {
	public int par[];
	public int rank[];

	UnionFind(int n) {
		par = new int[n + 1];
		rank = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			par[i] = i;
		}
	}

	public int find(int x) {
		if (par[x] == x) {
			return x;
		} else {
			return par[x] = find(par[x]);
		}
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

	public boolean all() {
		boolean flag = true;
		int a = find(1);
		for (int i = 1; i < par.length; i++) {
			if (find(i) != a) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}