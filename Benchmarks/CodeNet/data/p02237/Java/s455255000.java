
import java.util.LinkedList;
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
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		for(int i = 0; i < totalVertex; i++) {
		for(int x = 0; x < totalVertex; x++) {
		adjMatrix[i][x] = 0;
		}
		}
		for(int i = 0; i < adjList.size(); i++) {
		LinkedList<Integer> curr = adjList.get(i);
		for(int x = 0; x < curr.size(); x++) {
		adjMatrix[i][curr.get(x)] = 1;
		}
		}
		for(int i = 0; i < totalVertex; i++) {
		for(int x = 0; x < totalVertex; x++) {
		if(x != totalVertex - 1) System.out.print(adjMatrix[i][x] + " ");
		else System.out.print(adjMatrix[i][x]);
		}
		System.out.println();
		}
		
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}
