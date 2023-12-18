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
		int n1, n2;
		for(n1 = 0; n1 < totalVertex; n1 ++)
			for(n2 = 0; n2 < totalVertex; n2 ++) 
				adjMatrix[n1][n2] = 0;

		Iterator<LinkedList<Integer>> it1 = adjList.iterator();
		n1 = 0;
		while(it1.hasNext()) {
			LinkedList<Integer> one = it1.next();
			Iterator<Integer> it2 = one.iterator();
			while(it2.hasNext()) { 
				n2 = it2.next();
				adjMatrix[n1][n2] = 1;
			}
			n1 ++;
		}
		for(n1 = 0; n1 < totalVertex; n1 ++) {
			for(n2 = 0; n2 < totalVertex; n2 ++) {
				if(n2 == totalVertex - 1)
					System.out.println(adjMatrix[n1][n2]);
				else
					System.out.print(adjMatrix[n1][n2] + " ");
			}
		}
	}
}

public class Main {
	public static void main(String args[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}

}
