
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
		//System.out.println("hi ------------------");
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjMatrix = new int[totalVertex][totalVertex];
		adjWeight = new int[totalVertex][totalVertex];
		ifSettled = new Boolean[totalVertex];
		for(int i = 0; i < totalVertex; i++)
		{
			ifSettled[i] = false;
		}
		
		for(int i = 0; i < totalVertex; i++)
		{
			for(int j = 0; j < totalVertex; j++)
			{
				int next = in.nextInt();
				if(next >= 0)
				{
					adjMatrix[i][j] = 1;
					adjWeight[i][j] = next;
				}else
				{
					adjMatrix[i][j] = 0;
					adjWeight[i][j] = 0;
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
	public int spanning(int s) {
		int size = 0;
		int[] solution = new int[totalVertex];
		for(int i = 0; i < totalVertex; i++)
		{
			solution[i] = Integer.MAX_VALUE;
		}
		
		solution[s] = 0;
		ifSettled[s] = true;
		
		int settle = s;
		boolean check = true;
		LinkedList<Integer> next;
		
		while(check)
		{
			next = getUnsettledNeighbors(settle);
			for(int i: next)
			{
				if(solution[i] > getWeight(settle, i))
				{
					solution[i] = getWeight(settle, i);
				}
			}
			
			settle = getUnsettledNearest(solution);
			ifSettled[settle] = true;
			size = size + solution[settle];
			
			check = false;
			for(int i = 0; i < totalVertex; i++)
			{
				if(ifSettled[i] == false)
				{
					check = true;
				}
			}
		}
		
		return size;
	}
}

public class Main{
	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		System.out.println(g.spanning(0));
	}
}
