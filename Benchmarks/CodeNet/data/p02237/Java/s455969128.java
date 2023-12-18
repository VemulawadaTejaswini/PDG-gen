
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
			int idx1 = in.nextInt() - 1; //we need 0123 not 1234
			int degree = in.nextInt(); //degree 2 number
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) { //degree: how many edges we have to the node
				int idx2 = in.nextInt() - 1; //coz every node -1
				tmp.add(idx2);
			}	
			adjList.add(tmp);
			//current adList:
			/*
			 	0 -> 1 -> 3
				1 -> 3
				2 -> null
				3 -> 2
			*/
		}
		in.close();
	}
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
		Graph p = new Graph();
		LinkedList<LinkedList<Integer>> adjList2;
		adjList2 = new LinkedList<LinkedList<Integer>>();
		adjList2 = p.adjList;
		
		for(int x=0;x<totalVertex;x++) {
			for(int y=0;y<totalVertex;y++) {
				adjMatrix[x][y] = 0; //fill up with 0
			}
		}
		//O(n): iterator
		//O(n^2): total
		Iterator<LinkedList<Integer>> cur = adjList.iterator();
		int index = 0;//the first index
		while(cur.hasNext()) {
			LinkedList<Integer> mm = cur.next();
			Iterator<Integer> mynext = mm.iterator();
			while(mynext.hasNext()) {
				int v = mynext.next();
				adjMatrix[index][v] = 1;
			}
			index++;
		}
		
		/*for(int x=0;x<totalVertex;x++) {
			for (int y=0;y<totalVertex;y++) {
				System.out.print(adjMatrix[x][y] + " "); //use print so it does not move to next line
			}
			System.out.println();
		}*/
		
		for(int w = 0; w < totalVertex; w ++) {
			for(int z = 0; z < totalVertex; z ++) {
				if(z == totalVertex - 1)
					System.out.println(adjMatrix[w][z]);
				else
					System.out.print(adjMatrix[w][z] + " ");
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printAdjMatrix();
	}

}

