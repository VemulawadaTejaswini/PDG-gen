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
		int u,v;
		for(int i = 0; i < totalVertex; i ++) {
			for(int j = 0; j < totalVertex; j ++) {
				adjWeight[i][j] = in.nextInt();
				if (adjWeight[i][j] != -1) {
					adjMatrix[i][j] = 1;
				}
			}
			ifSettled[i] = false;
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
		int[] distance = new int[totalVertex];
		for(int i = 0; i < totalVertex; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		distance[s] = 0;
		int curr = findMinVertex(distance);
		while (curr != -1 && distance[curr] != Integer.MAX_VALUE) {
			ifSettled[curr] = true;
			LinkedList<Integer> neighbors = getUnsettledNeighbors(curr);
			for(Integer n: neighbors) {
				distance[n] = Math.min(distance[n], getWeight(curr,n));
			}
			
			curr = findMinVertex(distance);
		}
		return distance;
	}
	
	public int findMinVertex(int[] distance) {
		int v = Integer.MAX_VALUE;
		int index = -1;
		for(int i = 0; i < totalVertex; i++) {
			if(distance[i] < v && ifSettled[i] == false) {
				v = distance[i];
				index = i;
			}
		}
		return index;
	}
	
}

public class Main {
	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		int cost = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			cost += dist[i];
		}
		System.out.println(cost);
	}
}
