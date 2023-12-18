import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph2 {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph2() { totalVertex = 0; }
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
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				int t = in.nextInt();
				if(t != -1) {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = t;
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
	
	public int[] Prim(int s) {
		LinkedList<Integer> linker = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i ++) linker.add(i);
			int[] distance = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) 
			distance[i] = Integer.MAX_VALUE;
		distance[s] = 0;
		while(linker.isEmpty() == false) {
			int j = getUnsettledNearest(distance);
			if(distance[j] == Integer.MAX_VALUE) 
				break;
			linker.remove(linker.indexOf(j));
			ifSettled[j] = true;
			Iterator<Integer> iter = 
					getUnsettledNeighbors(j).iterator();
			while(iter.hasNext()) {
				int m = iter.next();
				int k = getWeight(j, m); 
				if(k < distance[m]) distance[m] = k;
			}
		}
		return distance;
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph2 g = new Graph2();
		g.loadAdjMatrix();
		int[] dist = g.Prim(0);
		int cost = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			cost += dist[i];
		}
		System.out.println(cost);
	}
}
