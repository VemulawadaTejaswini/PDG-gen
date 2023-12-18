//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph1 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph1() { totalVertex = 0; }
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
		//complete the following
		int size = totalVertex;
		
		for(int i=0; i<size; i++) {
			for(int l =0; l<size; l++) {
				if(adjList.get(i).contains(l)) {
					adjMatrix[i][l]=1;
					System.out.print("1");
				}
                                else {
					adjMatrix[i][l]=0;
					System.out.print("0");
				}
				if (l!=size-1) {
					System.out.print(" ");
				}
				
			}
			
                 System.out.println();
		
               }
		
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph1 g = new Graph1();
		g.loadAdjList();
		g.printAdjMatrix();
	}
}
