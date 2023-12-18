import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Main {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Main() { 
		totalVertex = 0; 
	}
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
		for(int x = 0; x < adjMatrix.length; x++) {
			for(int y = 0; y < adjList.get(x).size(); y++) {
				adjMatrix[x][adjList.get(x).get(y)] = 1;
			}
		}
		for(int x = 0; x < adjMatrix.length; x++) {
			for(int y = 0; y < adjMatrix[0].length; y++) {
				if(adjMatrix[x][y] == null) {
					adjMatrix[x][y] = 0;
				}
				if(y == adjMatrix[0].length-1)
					System.out.print(adjMatrix[x][y]);
				else
					System.out.print(adjMatrix[x][y]+ " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String args[]) {
		Main g = new Main();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU

	



