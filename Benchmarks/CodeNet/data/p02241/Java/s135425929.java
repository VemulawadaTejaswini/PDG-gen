import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Grph {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Grph() { totalVertex = 0; }
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
//			u = in.nextInt();
//			int degree = in.nextInt();
			for(j = 0; j < totalVertex; j ++) {
				v = in.nextInt(); 
				if (v != -1) {
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = v;
				} else {
					adjWeight[i][j] = 999999999;
				}
				
			}	
			if (in.hasNextLine()) {
				in.nextLine();
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
		ArrayList<Integer> S = new ArrayList<Integer>();
		int[] dist = new int[totalVertex];
		for (int i = 0; i < dist.length; i++) {
			dist[i] = 999999999;
		}
		dist[s] = 0;
		
		while(S.size() != totalVertex) {
			int v = getUnsettledNearest(dist);
			LinkedList<Integer> neighbors = getUnsettledNeighbors(v);
			for (int i = 0; i < neighbors.size(); i++) {
				int x = neighbors.get(i);
				dist[x] = Math.min(getWeight(v, x), dist[x]);
			}
			ifSettled[v] = true;
			S.add(v);
		}
		
		return dist;
	}
	
	public int getNearestToAny(ArrayList<Integer> vlist) {
		int v = 0;
		double min = 999999999;
		for (int i = 0; i < vlist.size(); i++) {
			LinkedList<Integer> neighbors = getUnsettledNeighbors(vlist.get(i));
			for (int j = 0; j < neighbors.size(); j++) {
				if (min > getWeight(neighbors.get(j), vlist.get(i))) {
					min = getWeight(neighbors.get(j), vlist.get(i));
					v = j;
				}
			}
		}
		return v;
	}
	
}

public class Main {
	public static void main(String[] argv) {
		Grph g = new Grph();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		int sum = 0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			sum += dist[i];
		}
		System.out.println(sum);
	}
}
