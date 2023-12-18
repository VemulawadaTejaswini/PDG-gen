import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
	static class Graph {
		int vertices;
		ArrayList<ArrayList<Integer>> adjList;

		public Graph(int v) {
			vertices = v;
			adjList = new ArrayList<ArrayList<Integer>>();
			for(int i = 0; i < vertices; i++)
				adjList.add(new ArrayList<>());
		}

		public boolean addEdge(int start, int end) {
			if(start > vertices) 
				return false;
			
			adjList.get(start).add(end);
			return true;
		}

		public boolean isCycle() {
			boolean visited[] = new boolean[vertices];
			boolean recursiveArr[] = new boolean[vertices];

			// Do Depth First Search
			for (int i = 0; i < vertices; i++) {
				if (isCycleUtil(i, visited, recursiveArr))
					return true;
			}

			return false;
		}

		private boolean isCycleUtil(int vertex, boolean[] visited, boolean recursiveArr[]) {
			visited[vertex] = true;
			recursiveArr[vertex] = true;

			// Traverse through all adjacent vertices
			for(int i = 0; i < adjList.get(vertex).size(); i++) {
				int adjVertex = adjList.get(vertex).get(i);

				if(!visited[adjVertex] && isCycleUtil(adjVertex, visited, recursiveArr)) {
					return true;
				} else if(recursiveArr[adjVertex]) {
					return true;
				}
			}

			// Cannot find any cycle from current vertex
			recursiveArr[vertex] = false;
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numV = scanner.nextInt();
		int numE = scanner.nextInt();
		
		// Create new graph
		Graph g = new Graph(numV);

		// Read and add edges to graph
		for(int i = 0; i < numE; i++) {
			g.addEdge(scanner.nextInt(), scanner.nextInt());
		}

		System.out.println(g.isCycle() ? 1 : 0);

	}
}
