import java.util.LinkedList;
import java.util.Scanner;

class Graph_MST {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph_MST() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	//load graph from standard input
	public void loadAdjMatrix() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		for (int j = 0; j < totalVertex; j++) {
			ifSettled[j] = false;
			for (int i = 0; i < totalVertex; i++) {
				int weight = in.nextInt();
				if (weight != -1) {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = weight;
				}
				else {
					adjMatrix[i][j] = adjWeight[i][j] = 0;
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
	public int[] Prim(int s) {
		LinkedList<Integer> S = new LinkedList<Integer>();
		int[] dist = new int[totalVertex];
		for (int i = 0; i < totalVertex; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[s] = 0;
		while (S.size() < totalVertex) {
			int v = getUnsettledNearest(dist);
			S.add(v);
			LinkedList<Integer> neighbors = getUnsettledNeighbors(v);
			for (int x : neighbors) {
				dist[x] = Math.min(getWeight(v,x), dist[x]);
			}
			ifSettled[v] = true;
		}
		return dist;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph_MST g = new Graph_MST();
		g.loadAdjMatrix();
		int[] dist = g.Prim(0);
		int sum = 0;
		for(int d : dist) {
			sum = sum + d;
		}
		System.out.println(sum);
	}
}

