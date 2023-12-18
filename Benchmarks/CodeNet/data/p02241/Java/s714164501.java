import java.util.*;
import java.lang.*;


class Graph2{
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
		for(int i = 0; i < totalVertex; i ++) {
			ifSettled[i] = false;
			for(int j = 0; j < totalVertex; j ++) {
				adjMatrix[i][j] = adjWeight[i][j] = 0;
			}
		}
		int v;
		for(int i = 0; i < totalVertex; i ++) {
			for(int j = 0; j < totalVertex; j ++) {
				v = in.nextInt();
				if (v > -1) {adjMatrix[i][j] = 1;
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
	public int mst(int s) {
		int[] dist = new int[totalVertex];
		//boolean[] visited = new boolean[totalVertex];
		dist[0] = 0;
		for (int i = 1; i< dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		/*visited[0] = true;
		for (int i = 1; i< visited.length; i++) {
			visited[i] = false;
		}*/
		for(int i = 0 ; i < totalVertex; i++) {
			int node = getUnsettledNearest(dist);
			ifSettled[node] = true;
			LinkedList<Integer> nb = getUnsettledNeighbors(node);
			for(Integer n : nb) {
				dist[n] = Math.min(dist[n],getWeight(node,n));
			}
		}
		int result = 0;
		for (int i = 0; i < dist.length; i++) {
			result += dist[i];
		}
		return result;
	}
}

public class Main{
	public static void main(String[] argv) {
		Graph2 g = new Graph2();
		g.loadAdjMatrix();
		System.out.println(g.mst(0));
		}
	}
