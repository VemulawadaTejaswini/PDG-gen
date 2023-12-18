import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MST_graph g = new MST_graph();
		g.loadAdjMatrix();
		g.MinSpanTree();
	}
}

class MST_graph {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public MST_graph() { totalVertex = 0; }
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
		int v;
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				v = in.nextInt();
				if (v != -1) {
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
		int[] dist = new int[totalVertex];
		for (int i = 0; i< totalVertex; i++) {
			if (i == s) {
				dist[i] = 0;
			}else {
				dist[i] = Integer.MAX_VALUE;
			}
		}
		
		for (int count = 0; count < totalVertex - 1; count++) {
			int u = getUnsettledNearest(dist);
			ifSettled[u] = true;
			for (int v = 0; v < totalVertex; v++) {
				if(!ifSettled[v] && adjMatrix[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + adjWeight[u][v] < dist[v]) {
					dist[v] = dist[u] + adjWeight[u][v];
				}
			}
		}
		
		return dist;
	}
	
	public void MinSpanTree() {
		int[] parent = new int[totalVertex];
		int[] key = new int[totalVertex];
		
		for(int i = 0; i< totalVertex; i++) {
			key[i] = Integer.MAX_VALUE;
		}
		
		key[0] = 0;
		parent[0] = -1;
		
		for(int count = 0; count < totalVertex - 1; count++) {
			int u = getUnsettledNearest(key);
			ifSettled[u] = true;
			for(int v = 0; v < totalVertex; v++) {
				if(adjMatrix[u][v] != 0 && ifSettled[v] == false && adjWeight[u][v] < key[v]) {
					parent[v] = u;
					key[v] = adjWeight[u][v];
				}
			}
		}
		int cost = 0;
		for(int i = 0; i< totalVertex; i++) {
			int p = parent[i];
			if(p != -1) {
				cost += adjWeight[p][i];
			}
		}
		System.out.println(cost);
	}
	
}

