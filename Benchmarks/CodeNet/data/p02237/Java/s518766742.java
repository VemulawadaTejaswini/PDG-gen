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
		int[][] adjMatrix = new int[totalVertex][totalVertex];
		Iterator<LinkedList<Integer>> list = adjList.iterator(); 
		int i = 0;
		int j = 0; 
		while(list.hasNext()) {
			LinkedList<Integer> temp = list.next();
			while(j < temp.size()) {
				int num = temp.get(j);
				adjMatrix[i][num] = 1;
				j++;
			}//ends while
			j = 0;
			i++;
		}//ends while
		
		for(int k = 0; k< totalVertex; k++) {
			for(int l = 0; l< totalVertex; l++) {
				if(l == totalVertex - 1) System.out.print(adjMatrix[k][l]);
				else System.out.print(adjMatrix[k][l] + " ");
				
			}
			System.out.println();
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main{
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}
