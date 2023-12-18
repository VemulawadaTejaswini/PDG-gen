
//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Main{
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.bfs(0); 
		//g.printAdjMatrix();
	}
}
class Graph {
	public int totalVertex;
	public LinkedList<LinkedList<Integer>> adjList;
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
	
	
	public void bfs(int s) {
		
		LinkedList<Integer> toVisit = new LinkedList<Integer>();
		boolean[] seen = new boolean[totalVertex]; 
		int[] steps = new int[totalVertex]; 
		for(int i = 0; i < steps.length; i++) {
			steps[i] = -1; 
		}
		steps[s]=0; 
		
		toVisit.add(s); 
		seen[s] = true; 
		
		while(toVisit.size() != 0) {
			
			int u = toVisit.poll(); 
			
			
				for(int j = 0; j < adjList.get(u).size(); j++) {
					
					int n = adjList.get(u).get(j); 
					
					if( seen[n] == false)
					{
						toVisit.add(n); 
						seen[n] = true; 
						steps[n] = steps[u] + 1; 
					}
				}
			
		}
		for(int i = 0; i < totalVertex; i++) {
			System.out.println(i+1 + " " + steps[i]); 
		}
	}
	
	
	
	
	void topologicalSort(int s) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		for(int i = 0; i < totalVertex; i++) {
			for(int j = 0; j < totalVertex; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		//complete the following
		for(int i = 0; i < adjList.size(); i++) {
			for(int j = 0; j < adjList.get(i).size(); j++) {
				adjMatrix[i][adjList.get(i).get(j)] = 1; 
			}
		}
		for(int i = 0; i < adjMatrix.length; i++) {
			for(int j = 0; j < adjMatrix[0].length; j++) {
				if(j == 3)
					System.out.println(adjMatrix[i][j]); 
				else
					System.out.print(adjMatrix[i][j] + " ");
			}
		}
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU

