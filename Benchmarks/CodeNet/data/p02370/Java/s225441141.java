import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Stack;

class Graph {
	private int totalVertex;
	private int totalEdge;
	private LinkedList<LinkedList<Integer>> adjList;
	private boolean[] visited;
	private int[] inDegree;
	Stack<Integer> myStack = new Stack<Integer>(); 
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdge = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		inDegree = new int[totalVertex];
		visited = new boolean[totalVertex]; // default value is false
		
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		
		for (int i = 0; i< totalEdge; i++) {
			int source = in.nextInt();
			int target = in.nextInt();
			adjList.get(source).add(target);
			inDegree[target] += 1;
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
	
	public LinkedList<Integer> initialNode() {
		LinkedList<Integer> initialNode = new LinkedList<Integer>();
		// get a node with inDegree = 0
		for (int i = 0; i < totalVertex; i++) {
			if (inDegree[i] == 0) {
				initialNode.add(i);
			}
		}
		return initialNode;
	}
	
	public void DFS(int row) {
		visited[row] = true;
		LinkedList<Integer> neighbors = adjList.get(row);
		for(int i = 0; i < neighbors.size(); i ++) {
			int v1 = neighbors.get(i);
			if(visited[v1] == false) {
				DFS(v1);
			}
		}
		myStack.add(row);
	}
	public int getVertex() {
		return totalVertex;
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		// g.printAdjMatrix();
		// System.out.println();
		
		LinkedList<Integer>  myInitial = g.initialNode();
		for (int i = 0; i < myInitial.size(); i++) {
			g.DFS(myInitial.get(i)); // check every inDegree = 0 node
		}
		
		while(!g.myStack.empty()) {
			System.out.println(g.myStack.pop());
		}
	}
}
