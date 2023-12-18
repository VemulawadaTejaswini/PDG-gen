import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph() { totalVertex = 0; }
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
				int val = in.nextInt();
				if (val == -1) {
					adjMatrix[i][j] = 0;
					adjWeight[i][j] = 0;
				} else {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = val;
				}
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
		}*/
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
	
	public int prim(int s) {
		int[] dist = new int[totalVertex]; // array that stores distances
		LinkedList<Integer> unsettledNeighbor;
		LinkedList<Integer> sourceNeighbor = getNeighbors(s);
		
		for (int i = 0; i < totalVertex; i++) {
			dist[i] =  Integer.MAX_VALUE; // set all distance to infinity
		}
		
		dist[s] = 0; // set source node to have distance 0 from itself
		ifSettled[s] = true; // and put into settled list
		
		int n = sourceNeighbor.size();
		for (int i = 0; i<n; i++) {
			int idx1 = sourceNeighbor.remove();
			dist[idx1] = adjWeight[s][idx1];
		}
		
		for (int i = 0; i<totalVertex-1; i++) {
			// settle the nearest neighbor
			int unsettledNearest = getUnsettledNearest(dist);
			ifSettled[unsettledNearest] =  true;

			unsettledNeighbor =  getUnsettledNeighbors(unsettledNearest);
			int sizeN = unsettledNeighbor.size();
			for(int j = 0; j < sizeN;j ++) {
				int idx2 = unsettledNeighbor.remove();
				dist[idx2] = Math.min(dist[idx2],adjWeight[unsettledNearest][idx2]);
			}
		}
		
		int total = 0;
		for (int i = 0; i<dist.length; i++) {
			total += dist[i];
		}
		
		return total;
	}
}

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		System.out.println(g.prim(0));
	}
}
