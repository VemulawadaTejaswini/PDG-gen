import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		while(true) {
			int n = io.nextInt();
			int m = io.nextInt();
			int l = io.nextInt();
			if (n == 0) {
				break;
			}
			Graph g = new Graph(n*(l+1));
			for(int i=0;i<m;i++) {
				int a = io.nextInt()-1;
				int b = io.nextInt()-1;
				int d = io.nextInt();
				int e = io.nextInt();
				for(int j=l;j>=0;j--) {
					if (j - d >= 0) {
						g.addEdge(a*(l+1)+j, b*(l+1)+(j-d), 0);
						g.addEdge(b*(l+1)+j, a*(l+1)+(j-d), 0);
					}
					g.addBidirectionalEdge(a*(l+1)+j, b*(l+1)+j, e);
				}
			}
			int[] dist = g.minDistDijkstra(l);
			int ans = Graph.INF;
			for(int i=0;i<=l;i++) {
				ans = Math.min(ans, dist[(n-1)*(l+1)+i]);
			}
			io.println(ans);
			System.gc();
		}
		io.flush();
	}

}
class IO {
	BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
	StringBuilder out = new StringBuilder();
	int index = 0;
	String bfl = null;
	String[] bf = new String[0];
	private boolean read() {
		try {
			bfl = bi.readLine();
			if (bfl == null) {
				return false;
			}
			bf = bfl.split("\\s");
			index = 0;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean hasNext() { return index < bf.length ? true : read(); }
	public boolean hasNextLine() { return read(); }
	public String next() { return hasNext() ? bf[index++] : null; }
	public String nextLine() { if (hasNextLine()) {index = bf.length; return bfl; }else return null; }
	public int nextInt() { return Integer.parseInt(next()); }
	public long nextLong() { return Long.parseLong(next()); }
	public double nextDouble() { return Double.parseDouble(next()); };
	public char nextChar() { return next().charAt(0); }
	public void println(long x) { out.append(x); out.append("\n"); }
	public void println(double x) { out.append(x); out.append("\n"); }
	public void println(String s) { out.append(s); out.append("\n"); }
	public void println() { out.append("\n"); }
	public void print(long x) { out.append(x); }
	public void print(double x) { out.append(x); }
	public void print(String s) { out.append(s); }
	public void print(char c) {out.append(c);}
	public void flush() {System.out.print(out); out = new StringBuilder(); }
	public int[] arrayInt(int n) {
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = nextInt();
		}
		return a;
	}
	public long[] arrayLong(int n) {
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = nextLong();
		}
		return a;
	}
	public double[] arrayDouble(int n) {
		double[] a = new double[n];
		for(int i=0;i<n;i++) {
			a[i] = nextDouble();
		}
		return a;
	}
}

class Graph {
	public static final int INF = 1<<29;
	int n;
	ArrayList<Edge>[] graph;

	@SuppressWarnings("unchecked")
	public Graph(int n) {
		this.n = n;
		this.graph = new ArrayList[n];
		for(int i=0;i<n;i++) {
			graph[i] = new ArrayList<Edge>();
		}
	}

	public void addBidirectionalEdge(int from,int to,int cost) {
		addEdge(from,to,cost);
		addEdge(to,from,cost);
	}
	public void addEdge(int from,int to,int cost) {
		graph[from].add(new Edge(to, cost));
	}

	//dijkstra O(ElogV)
	public int[] minDistDijkstra(int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.offer(new Node(0, s));
		while(!q.isEmpty()) {
			Node node = q.poll();
			int v = node.id;
			if (dist[v] < node.dist) {
				continue;
			}
			for(Edge e:graph[v]) {
				if (dist[e.to] > dist[v] + e.cost) {
					dist[e.to] = dist[v] + e.cost;
					q.add(new Node(dist[e.to], e.to));
				}
			}
		}
		return dist;
	}

	class Edge {
		int to;
		int cost;
		public Edge(int to,int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	class Node implements Comparable<Node>{
		int dist;
		int id;
		public Node(int dist,int i) {
			this.dist = dist;
			this.id = i;
		}
		public int compareTo(Node o) {
			return (this.dist < o.dist) ? -1 : ((this.dist == o.dist) ? 0 : 1);
		}
	}
}