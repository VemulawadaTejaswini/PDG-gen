import java.util.*;
import java.lang.*;

class Main {
	static class Graph {
		List<List<Edge>> adjList;

		public Graph(List<Edge> edges, int numVertices) {
			adjList = new ArrayList<>(numVertices);

			for(int i = 0; i < numVertices; i++) {
				adjList.add(new ArrayList<>());
			}

			for(Edge edge : edges) {
				adjList.get(edge.source).add(edge);
			}
		}
	}

	static class Edge {
		int source;
		int dest;
		int weight; // weight of edge

		public Edge(int s, int d, int w) {
			source = s;
			dest = d;
			weight = w;
		}
	}

	static class Node {
		int index;
		int weight; // weight in min-heap

		public Node(int i, int w) {
			index = i;
			weight = w;
		}
	}

	public static void findSSSP(Graph g, int source, int numVertices) {
		// Create min-heap and push the source into it
		PriorityQueue<Node> minHeap = new PriorityQueue<>((lhs, rhs) -> lhs.weight - rhs.weight);
		minHeap.add(new Node(source, 0)); // dist of source is 0

		// Initialize distance of all vertices to Infinity
		List<Integer> dist = new ArrayList<>(Collections.nCopies(numVertices, Integer.MAX_VALUE));

		// Set distance of source to 0
		dist.set(source, 0);

		// Mark processed vertices to True
		boolean[] done = new boolean[numVertices];
		done[source] = true; // no need to process source

		// Store predecessors of a vertex
		int[] prev = new int[numVertices];
		prev[source] = -1; // source has no predecessor

		while(!minHeap.isEmpty()) {
			// Get best vertex and remove from minHeap
			Node n = minHeap.poll();

			// Get vertex number
			int vertex = n.index;

			// Process all neighbors of vertex
			for(Edge edge : g.adjList.get(vertex)) {
				int dest = edge.dest;
				int weight = edge.weight;

				// Relaxation step
				if(!done[dest] && dist.get(dest) > dist.get(vertex) + weight) {
					// Update predecessor
					prev[dest] = vertex;
					dist.set(dest, dist.get(vertex) + weight);
					minHeap.add(new Node(dest, dist.get(dest)));
				}
			}

			// Finished processing vertex
			done[vertex] = true;
		}

		// Print results
		for(int i = 0; i < numVertices; i++) {
			int distance = dist.get(i);

			System.out.println(distance == Integer.MAX_VALUE ? "INF" : distance);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();
		int source = scanner.nextInt();

		// Read edges
		List<Edge> edgesList = new ArrayList<>();
		for (int i = 0; i < edges; i++) {
			Edge edge = new Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			edgesList.add(edge);
		}

		// Create new graph
		Graph g = new Graph(edgesList, vertices);

		findSSSP(g, source, vertices);
	}
}
