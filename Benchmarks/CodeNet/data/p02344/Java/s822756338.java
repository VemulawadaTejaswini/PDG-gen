import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	class DisjointSet {

		int[] parent;
		int[] rank;
		int[] weight;
		
		public DisjointSet(int size) {
			parent = new int[size];
			rank = new int[size];
			weight = new int[size];
			for (int i = 0; i < size; i++) makeSet(i);
		}

		private void makeSet(int x) {
			parent[x] = x;
			rank[x] = 0;
			weight[x] = 0;
		}

		public void relate(int x, int y, int z) {
			link(findSet(x), findSet(y), z - weight[x] + weight[y]);
		}

		private void link(int x, int y, int cost) {
			if (rank[x] > rank[y]) {
				parent[y] = x;
				weight[y] -= cost;
			} else {
				parent[x] = y;
				weight[x] += cost;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}

		public boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}

		private int findSet(int x) {
			if (parent[x] != x) {
				int tmp = findSet(parent[x]);
				weight[x] += weight[parent[x]];
				parent[x] = tmp;
			}
			return parent[x];
		}

		public int sum(int x) {
			int sum = 0;
			int cur = x;
			while (cur != parent[cur]) {
				sum += weight[cur];
				cur = parent[cur];
			}
			return sum;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		DisjointSet ds = new DisjointSet(n);
		int q = Integer.parseInt(st.nextToken());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int c = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (c == 0) {
				int z = Integer.parseInt(st.nextToken());
				ds.relate(x, y, z);
			} else {
				if (!ds.same(x, y)) {
					System.out.println("?");
				} else {
					System.out.println(ds.sum(x) - ds.sum(y));
				}
			}
		}
		reader.close();
	}
}

