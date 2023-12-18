import java.util.*;
import java.lang.*;

class Main {
	int parents[];
	int rank[];

	public void run() {
		Scanner scanner = new Scanner(System.in);
		int numVertices = scanner.nextInt();
		int numEdges = scanner.nextInt();
		int src, dest, weight;

		// Build graph
		Graph G = new Graph(numVertices, numEdges);

		for(int i = 0; i < numEdges; i++) {
			src = scanner.nextInt();
			dest = scanner.nextInt();
			weight = scanner.nextInt();

			G.addEdge(i, src, dest, weight);
		}

		// Build disjoint sets
		parents = new int[numVertices];
		rank = new int[numVertices];

		for(int i = 0; i < numVertices; i++) {
			createSet(i);
		}

		// Run Kruskal algorithm and print sum of weights of the MST
		System.out.println(KruskalMST(G, numVertices, numEdges));
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void createSet(int n) {
		parents[n] = n;
		rank[n] = 0;
	}

	public int findSet(int n) {
		if(n != parents[n])
			parents[n] = findSet(parents[n]);
		return parents[n];
	}

	public void union(int x, int y) {
		int xroot = findSet(x);
		int yroot = findSet(y);

		if(xroot == yroot)
			return;

		if(rank[xroot] > rank[yroot]) {
			parents[yroot] = xroot;
		} else {
			parents[xroot] = yroot;
			if(rank[xroot] == rank[yroot])
				rank[yroot]++;
		}
	}

	public int KruskalMST(Graph G, int numVertices, int numEdges) {
		Edge result[] = new Edge[numVertices];
		Edge edges[] = G.getEdges();

		// Sort all edges of graph G
		Arrays.sort(edges);

		int sum = 0;
		int i = 0, e = 0;
		while(e < numVertices-1) {
			
			// get the next edge with minimum weight
			Edge nextEdge = edges[i++];

			int x = findSet(nextEdge.getSrc());
			int y = findSet(nextEdge.getDest());

			if(x != y) { // if including this edge doesn't form a cycle
				result[e++] = nextEdge;
				sum += nextEdge.getWeight();
				union(x, y);
			}
		}

		return sum;
	}

	class Graph {
		private int V, E;
		private Edge edges[];

		public Graph(int v, int e) {
			V = v;
			E = e;
			edges = new Edge[e];
		}

		public void addEdge(int i, int src, int dest, int weight) {
			if(i >= E) 
				return;

			edges[i] = new Edge(src, dest, weight);
		}

		public Edge[] getEdges() {
			return edges;
		}
	}

	class Edge implements Comparable<Edge>{
		private int src, dest, weight;

		public Edge(int s, int d, int w) {
			src = s;
			dest = d;
			weight = w;
		}

		public int compareTo(Edge anotherEdge) {
			return this.weight - anotherEdge.weight;
		}

		public int getSrc() {
			return src;
		}

		public int getDest() {
			return dest;
		}

		public int getWeight() {
			return weight;
		}
	}
}
