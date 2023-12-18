import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graphy {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	
	private final int inf = Integer.MAX_VALUE;
	
	public Graphy() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	//load graph from standard input
	public void loadAdjMatrix() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		int i, j;
		for(i = 0; i < totalVertex; i ++) {
			ifSettled[i] = false;
			for(j = 0; j < totalVertex; j ++) {
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}
		}
		/*
		int u, v;
		for(i = 0; i < totalVertex; i ++) {
			u = in.nextInt();
			int degree = in.nextInt();
			for(j = 0; j < degree; j ++) {
				v = in.nextInt(); 
				adjMatrix[u][v] = 1;
				adjWeight[u][v] = in.nextInt();
			}	
		} */
		
		for (i = 0; i < totalVertex; i++) {
			for (j = 0; j < totalVertex; j++) {
				
				int n = in.nextInt();
				
				if (n == -1) {
					
					adjMatrix[i][j] = 0;	
					
				} else {
					
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = n;
						
				}
				
				
				
				
			}
		}
		
		in.close();
	}
	//return weight of the edge from u to v if there is one
	public int getWeight(int u, int v) {
		return adjWeight[u][v];
	}
	//return neighbors of u as a LinkedList
	public LinkedList<Integer> getNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if(adjMatrix[u][v] == 1) tmp.add(v);
		}
		return tmp;
	}
	//return unsettled neighbors of u as a LinkedList
	public LinkedList<Integer> getUnsettledNeighbors(int u) {
		LinkedList<Integer> tmp = new LinkedList<Integer>();
		for(int v = 0; v < totalVertex; v ++) {
			if((adjMatrix[u][v] == 1) && (ifSettled[v] == false)) tmp.add(v);
		}
		return tmp;
	}
	
	//return the unsettled node that has the smallest dist
	public int getUnsettledNearest(int[] dist) {
		int md = Integer.MAX_VALUE;
		int mv = -1;
		int v;
		for(v = 0; v < totalVertex; v ++) {
			if((ifSettled[v] == false) && (dist[v] < md)) {
				md = dist[v];
				mv = v;
			}
		}
		return mv;
	}
	
	
	public int getMinDistance(ArrayList<Integer> A, int[] d) {
		
		int min = inf;
		int minI = 0;
		
		for (int n : A) {
			//System.out.println(n + ", " + d[n]);
			//min = (d[n] < min) ? d[n] : min; 
			if (d[n] < min) {
				min = d[n];
				minI = n;
			}
		
		}
		
		return minI;
	
	}
	
	//implement the following	
	//argument is the vertex to go off of
	
	public int[] Dijkstra(int s) {
		
		
		//Initializing queue
		ArrayList<Integer> unsettled = new ArrayList<Integer>();
		unsettled.add(s);
		
		//Initializing distances
		int[] d = new int[totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			if (i == s) { d[i] = 0; } 
			else { d[i] = inf; }
		}
		
		int old, cur;

				
		//The main processing loop
		while (!unsettled.isEmpty()) {
	
			cur = getMinDistance(unsettled, d);

			//System.out.println(cur + ": " + d[cur]);
			
			//Get the neighbors to process
			LinkedList<Integer> neighbors = getUnsettledNeighbors(cur);
			
			//Process neighbors to settle this node
			for (int n : neighbors) {
				//add to processing queue
				if (!unsettled.contains(n)) { unsettled.add(n); }
				
				//update distance if necessary
				int len = getWeight(cur, n);
				if (len < d[n]) { d[n] = len; }
				
			}
		
		//Set the node you're processing to settled, and remove from unsettled
		ifSettled[cur] = true;		
		unsettled.remove(new Integer(cur));
		
		}
		
		return d;	
	}
}

public class Main {
	public static void main(String[] argv) {
		Graphy g = new Graphy();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		int sum = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			sum += dist[i];
		}
		System.out.println(sum);
	}
}
