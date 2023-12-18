
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
		for(int i = 0; i < adjMatrix.length; i++) {
			for(int j = 0; j < totalVertex ; j++) {
				adjMatrix[i][j] = 0;
			}
		}		
		int a = 0;		
		for(LinkedList<Integer> S: this.adjList) {
			for(Integer i : S) {
				adjMatrix[a][i] = 1;
			}
			a++;
		}	
		for(int m = 0; m < adjMatrix.length; m++) {
			for(int n = 0; n < totalVertex; n++) {
				if(n == totalVertex - 1) {
					System.out.println(adjMatrix[m][n]);
				}
				else {
					System.out.print(adjMatrix[m][n] + " ");
				}
			}
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}
