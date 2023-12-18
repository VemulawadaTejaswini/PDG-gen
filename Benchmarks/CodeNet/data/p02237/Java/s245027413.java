//template code, C343, 2019
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
	
	//do an iterator
	//ID, neighbor, actual neighbors following neighbors
	public void printAdjMatrix() {
		int[][] adjMatrix = new int[totalVertex][totalVertex];
		
		Iterator<LinkedList<Integer>> iter = adjList.iterator();
		
		
		
		for(int i = 0; i < adjList.size(); i++) {
			LinkedList<Integer> currList = iter.next();
			Iterator<Integer> currListIter = currList.iterator();
			
			for(int j = 0; j < currList.size(); j++) {
				adjMatrix[i][currList.get(j)] = 1; 
			}
		}
		
		for(int k = 0; k < adjList.size(); k++) {
			for(int l = 0; l < adjList.size(); l++) {
				if(l < adjList.size()-1) {
					System.out.print(adjMatrix[k][l] + " ");
				} else if(l == adjList.size()-1) {
					System.out.print(adjMatrix[k][l]);
					System.out.println();
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
