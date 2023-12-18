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
			in.nextInt();
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
		LinkedList<Integer> tempNode;
		Iterator<LinkedList<Integer>> outer = adjList.iterator();
		int  rw = 0;
		while (outer.hasNext()) {
			tempNode = outer.next();
			Iterator<Integer> inner = tempNode.iterator();
			while(inner.hasNext()) {
				adjMatrix[rw][inner.next()] = 1;
			}
			rw++;
		}
			
		for(int i = 0; i<totalVertex;i++) {
			for (int j = 0; j < totalVertex; j++) {
				if (adjMatrix[i][j] != null) {
					System.out.print(adjMatrix[i][j]);
				} else {
					System.out.print(0);
				}
				if (j != totalVertex-1) {
					System.out.print(" ");					
				}				
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

