import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
import java.lang.Math;

class Graph1 {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	int[] distances;
	public Graph1() { 
		totalVertex = 0;
	}
	public int getTotalVertex() { return totalVertex; }
	//load graph from standard input
	public void loadAdjMatrix() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		distances = new int[totalVertex];
		distances[0] = 0;
		for(int i = 1; i < totalVertex; i++) {
			distances[i] = Integer.MAX_VALUE;
		}
		int i, j;
		for(i = 0; i < totalVertex; i ++) {
			ifSettled[i] = false;
			for(j = 0; j < totalVertex; j ++) {
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}
		}
		int u, v;
		for(i = 0; i < totalVertex; i ++) {
			//u = in.nextInt();
			//int degree = in.nextInt();
			for(j = 0; j < totalVertex; j ++) {
				v = in.nextInt();
				if(v!= -1) {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = v;
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
	//implement the following	
	public int[] Dijkstra(int s) {
		LinkedList<Integer> unsettled = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i++) {
			unsettled.add(i);
		}
		
		while(!unsettled.isEmpty()){
			int node = this.getUnsettledNearest(distances);
			for(Integer x : this.getUnsettledNeighbors(node)) {
				
				distances[x] = Integer.min(this.getWeight(node, x), distances[x]);
			}
			ifSettled[node] = true;
			unsettled.remove((Integer)node);
		}
		return distances;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph1 g = new Graph1();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		int total = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			total += dist[i];
		}
		System.out.println(total);
	}
}
