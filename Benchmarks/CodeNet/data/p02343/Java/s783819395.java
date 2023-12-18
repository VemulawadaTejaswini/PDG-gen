import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private class DisjointSet {
		
		int[] p, rank;
		
		public DisjointSet(int size) {
			p = new int[size];
			rank = new int[size];
			for (int i = 0; i < size; i++) {
				makeSet(i);
			}
		}

		private void makeSet(int x) {
			p[x] = x;
			rank[x] = 0;
		}
		
		public boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}

		private int findSet(int x) {
			while (p[x] != x) {
				x = p[x];
			}
			return p[x];
		}
		
		public void unite(int x, int y) {
			link(findSet(x), findSet(y));
		}

		private void link(int x, int y) {
			if (rank[x] > rank[y]) {
				p[y] = x;
			} else {
				p[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}
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
			int x= Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (c == 0) {
				ds.unite(x, y);
			} else {
				System.out.println(ds.same(x, y)?"1":"0");
			}
		}
		reader.close();
	}
}
