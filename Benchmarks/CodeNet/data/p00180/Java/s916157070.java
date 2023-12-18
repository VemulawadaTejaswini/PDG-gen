import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0) {
				break;
			}
			Kruscal g = new Kruscal(n);
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				g.addBidirectionalEdge(a,b,c);
			}
			System.out.println(g.minCost());
		}
	}

}

class Kruscal {
	int n;
	ArrayList<Edge> graph = new ArrayList<Edge>();

	public Kruscal(int n) {
		this.n = n;
	}

	public void addBidirectionalEdge(int u,int v,int cost) {
		graph.add(new Edge(cost,u,v));
	}

	public int minCost() {
		Collections.sort(graph);
		UnionFind uf = new UnionFind(n);
		int ans = 0;
		int connected = 1;
		for(int i=0;i<graph.size();i++) {
			Edge e = graph.get(i);
			if (!uf.isConnected(e.from, e.to)) {
				uf.union(e.from, e.to);
				connected++;
				ans+=e.cost;
				if (connected==n) {
					break;
				}
			}
		}
		return ans;
	}

	static class Edge implements Comparable<Edge>{
		int cost;
		int from;
		int to;
		public Edge(int cost,int from,int to) {
			this.cost = cost;
			this.from = from;
			this.to = to;
		}
		@Override
		public int compareTo(Edge o) {
			if (this.cost == o.cost) {
				return 0;
			}else if(this.cost > o.cost) {
				return 1;
			}else{
				return -1;
			}
		}

		public String toString() {
			return this.cost + "," + this.from + "," + this.to;
		}
	}

	static class UnionFind {
		private int[] data;
		public UnionFind(int size) {
			data = new int[size];
			Arrays.fill(data, -1);
		}
		public void union(int x,int y) {
			x = root(x);
			y = root(y);
			if (x!=y) {
				if (data[y] < data[x]) {
					int tmp = y;
					y = x;
					x = tmp;
				}
				data[x] += data[y];
				data[y] = x;
			}
		}
		public boolean isConnected(int x,int y) {
			return root(x)==root(y);
		}
		private int root(int x) {
			return data[x] < 0 ? x : (data[x] = root(data[x]));
		}
		public int size(int x) {
			return -data[root(x)];
		}
		public String toString() {
			return Arrays.toString(data);
		}
	}
}