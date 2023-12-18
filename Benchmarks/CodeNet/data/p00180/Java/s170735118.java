import static java.util.Arrays.deepToString;
import static java.util.Arrays.fill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0) break;
			List<E> es = new ArrayList<E>();
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				E e = new E(a, b, c);
				es.add(e);
			}
			UnionFind uf = new UnionFind(n);
			Collections.sort(es);
			
			int ans = 0;
			for (E e: es) {
				if (uf.root(e.a) != uf.root(e.b)) {
					uf.link(e.a, e.b);
					ans += e.c;
				}
			}
			System.out.println(ans);
		}
	}
	
	static class E implements Comparable<E> {
		int a;
		int b;
		int c;
		E(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		@Override
		public int compareTo(E o) {
			return c - o.c;
		}
	}

public class UnionFind {
	int[] data;
	public UnionFind(int n) {
		data = new int[n];
		fill(data, -1);
	}
	boolean link(int x, int y) {
		x = root(x);
		y = root(y);
		if (x != y) {
			if (data[y] < data[x]) {
				data[y] += data[x];
				data[x] = y;
			} else {
				data[x] += data[y];
				data[y] = x;
			}
		}
		return x != y;
	}
	int root(int x) {
		return data[x] < 0 ? x : (data[x] = root(data[x]));
	}
}

}