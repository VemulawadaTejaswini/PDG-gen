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
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}
		}
		int u, v;
		for(i = 0; i < totalVertex; i ++) {
			u = in.nextInt();
			int degree = in.nextInt();
			for(j = 0; j < degree; j ++) {
				v = in.nextInt(); 
				adjMatrix[u][v] = 1;
				adjWeight[u][v] = in.nextInt();
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
	
	public boolean allVisited() {
		for (int i = 0; i < ifSettled.length; i++) {
			if (ifSettled[i] == false) return false;
		}
		return true;
	}
	//implement the following	
	public int[] Dijkstra(int s) {
		int[] dist = new int[totalVertex];
		
		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		dist[s] = 0;
		
		int curr = s;	
		while (!allVisited()) {
			ifSettled[curr] = true;
			LinkedList<Integer> neighbours = getUnsettledNeighbors(curr);
			Iterator<Integer> itr = neighbours.iterator();
			
			while (itr.hasNext()) {
				int next = itr.next();
				int cost = getWeight(curr, next);
				if (dist[next] > cost + dist[curr]) dist[next] = cost + dist[curr];
			}
			
			curr = getUnsettledNearest(dist);
		}
		
		return dist;
	}
}

public class Main {

	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			System.out.println(i + " " + dist[i]);
		}
	}

}

