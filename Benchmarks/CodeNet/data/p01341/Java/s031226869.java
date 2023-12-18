import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		new Main().solver();
	}

	void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		PriorityQueue<Edge> edges = new PriorityQueue<>();
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			edges.add(new Edge(p, q, (x[p] - x[q]) * (x[p] - x[q]) + (y[p] - y[q]) * (y[p] - y[q])));
		}
		System.out.println(MST(edges,n));
	}

	double MST(PriorityQueue<Edge> edges,int n) {
		DJSet ds = new DJSet(n);
		double ans = 0;
		while (!edges.isEmpty()) {
			Edge e = edges.poll();
			if (!ds.same(e.dst, e.src)) {
				ds.setUnion(e.dst, e.src);
			} else {
				ans += Math.sqrt(e.weight);
			}
		}
		return ans;
	}

	class Edge implements Comparable<Edge> {
		int src;
		int dst;
		long weight;

		Edge(int src, int dst, long weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return -Long.compare(this.weight, o.weight);
		}
	}

	class DJSet {
		int n;
		int[] s;

		public DJSet(int n) {
			this.n = n;
			s = new int[n];
			Arrays.fill(s, -1);
		}

		int find(int x) {
			if (s[x] < 0) {
				return x;
			} else {
				return find(s[x]);
			}
		}

		boolean same(int x, int y) {
			return find(x) == find(y);
		}

		boolean setUnion(int x, int y) {
			if (find(x) != find(y)) {
				x = find(x);
				y = find(y);
				if (count(x) < count(y)) {
					int tmp = x;
					x = y;
					y = tmp;
				}
				s[x] += s[y];
				s[y] = x;
				return true;
			} else {
				return false;
			}
		}

		int count(int x) {
			return -s[find(x)];
		}

		int size() {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (s[i] < 0) {
					count += -s[i];
				}
			}
			return count;
		}
	}
}