import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}

	public void BfsSP() {
		int[] distances = new int[totalVertex];
		boolean[] visited = new boolean[totalVertex];
		for (int i = 1; i < distances.length; i++) {
			distances[i] = -1;
		}

		Queue<Integer> unvisitedNodes = new LinkedList<>();
		unvisitedNodes.add(0);

		while (!unvisitedNodes.isEmpty()) {
			int currVertex = unvisitedNodes.poll();
			visited[currVertex] = true;
			LinkedList<Integer> neighborList = adjList.get(currVertex);
			for (Integer neighbor : neighborList) {
				if (!visited[neighbor]) {
					unvisitedNodes.add(neighbor);
					int newDistance = distances[currVertex] + 1;
					distances[neighbor] = distances[neighbor] == -1 ? newDistance : Math.min(distances[neighbor], newDistance);
				}
			}
		}

		for (int i = 0; i < distances.length; i++) {
			System.out.println((i + 1) + " " + distances[i]);
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BfsSP();
	}
}
