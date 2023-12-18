import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	class DisjointUnionSets {
		int[] rank, parent;
		int n;

		public DisjointUnionSets(int n) {
			rank = new int[n];
			parent = new int[n];
			this.n = n;
			makeSet();
		}

		void makeSet() {
			for (int i = 0; i < n; i++) {

				parent[i] = i;
			}
		}

		int find(int x) {

			if (parent[x] != x) {

				parent[x] = find(parent[x]);

			}

			return parent[x];
		}

		void union(int x, int y) {

			int xRoot = find(x), yRoot = find(y);

			if (xRoot == yRoot) {
				return;
			}

			if (rank[xRoot] < rank[yRoot]) {

				parent[xRoot] = yRoot;
			} else if (rank[yRoot] < rank[xRoot]) {

				parent[yRoot] = xRoot;
			} else {

				parent[yRoot] = xRoot;
				rank[xRoot] = rank[xRoot] + 1;
			}
		}
		
		int count() {
			Set<Integer> parent = new HashSet<Integer>();
			
			for(int i=1; i<n; i++) {
				parent.add(find(i));
			}
			
			return parent.size() - 1;
		}
	}

	public void execute(int input) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (input == 1) {
			br = new BufferedReader(new FileReader("test.txt"));
		}


		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		DisjointUnionSets disjointUnionSets = new DisjointUnionSets(n + 1);
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			disjointUnionSets.union(a, b);		
		}
		
		System.out.println(disjointUnionSets.count());
	}

	public static void main(String[] args) throws Exception {

		Main a = new Main();

		a.execute(0);

	}
}