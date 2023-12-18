import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private class DisjointSet {
		
		int[] p;
		int[] rank;

		public DisjointSet(int size) {
			p = new int[size];
			rank = new int[size];
			for (int i = 0; i < size; i++) makeSet(i);
		}

		private void makeSet(int x) {
			p[x] = x;
			rank[x] = 0;
		}
		
		public boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}

		private int findSet(int x) {
			int v = x;
			int parent = p[v];
			while (parent != v) {
				parent = p[v];
				v = p[parent];
			}
			return parent;
		}
		
		public void unite(int x, int y) {
			link(findSet(x), findSet(y));
		}

		private void link(int x, int y) {
			if (rank[x] < rank[y]) {
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
//		BufferedReader reader = new BufferedReader(new FileReader("D:\\temp\\20190422\\in.txt"));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		DisjointSet ds = new DisjointSet(n);
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			ds.unite(id1, id2);
		}
		
		int q = Integer.parseInt(reader.readLine());
		for (int i = 0; i < q; i++) {
			st = new StringTokenizer(reader.readLine());
			int id1 = Integer.parseInt(st.nextToken());
			int id2 = Integer.parseInt(st.nextToken());
			if (ds.same(id1, id2)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		reader.close();
	}
}
