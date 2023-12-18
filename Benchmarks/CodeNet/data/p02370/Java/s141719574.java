import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private ArrayList<LinkedList<Integer>> adjList;
	private int[][] adjMatrix;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	/*
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
	*/

	public void loadAdjList() {
		Scanner input = new Scanner(System.in);
		totalVertex = input.nextInt();
		int totalEdges = input.nextInt();

		adjList = new ArrayList<>(totalVertex);
		for (int i = 0; i < totalVertex; i++) {
			adjList.add(new LinkedList<>());
		}

		for (int i = 0; i < totalEdges; i++) {
			int src = input.nextInt();
			int dest = input.nextInt();
			adjList.get(src).add(dest);
		}
		input.close();
	}

	public void loadAdjMatrix() {
		adjMatrix = new int[totalVertex][totalVertex];

		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> neighborList = adjList.get(i);
			for (Integer neighbor : neighborList) {
				adjMatrix[i][neighbor] = 1;
			}
		}
	}

	public void topologicalSort() {
		int[] indegree = new int[totalVertex];
		Queue<Integer> eligibleNodes = new LinkedList<>();

		for (int i = 0; i < adjList.size(); i++) {
			LinkedList<Integer> neighborList = adjList.get(i);
			for (Integer neighbor : neighborList) {
				indegree[neighbor]++;
			}
		}

		for (int i = 0; i < totalVertex; i++) {
			if (indegree[i] == 0) {
				eligibleNodes.add(i);
			}
		}

		while (!eligibleNodes.isEmpty()) {
			int currVertex = eligibleNodes.poll();
			System.out.println(currVertex);

			for (int i = 0; i < totalVertex; i++) {
				if (adjMatrix[currVertex][i] == 1) {
					indegree[i]--;
					if (indegree[i] == 0) {
						eligibleNodes.add(i);
					}
				}
			}
		}
	}

	public void recursiveTopological() {
		Stack<Integer> output = new Stack<>();
		boolean[] visited = new boolean[totalVertex];
		
		for (int i = 0 ; i < totalVertex; i++) {
			if (!visited[i]) {
				helperRecursiveTop(i, visited, output);
			}
		}

		while (!output.isEmpty()) {
			System.out.println(output.pop());
		}
	}

	public void helperRecursiveTop(int vertex, boolean[] visited, Stack<Integer> output) {
		visited[vertex] = true;
		LinkedList<Integer> neighborList = adjList.get(vertex);

		for (Integer neighbor : neighborList) {
			if (!visited[neighbor]) {
				helperRecursiveTop(neighbor, visited, output);
			}
		}

		output.push(vertex);
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.loadAdjMatrix();
		// g.BfsSP();
		// g.topologicalSort();
		g.recursiveTopological();
	}
}
