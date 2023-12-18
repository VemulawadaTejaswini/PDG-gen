

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph1 {
	private int totalVertex;
	//adjMatrix[u][v] = 1 if there is an edge from u to v, otherwise 0
	private int[][] adjMatrix;
	//adjWeight[u][v] -- the weight of the edge from u to v if there is one
	private int[][] adjWeight;
	//if a node is settled (e.g., processed in the Dijkstra's algorithm)
	private Boolean[] ifSettled;
	public Graph1() { totalVertex = 0; }
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
		}   //fill table with 0
		for(i = 0; i < totalVertex; i ++) {
			for(j = 0; j < totalVertex; j ++) {
				int w = in.nextInt();
				if(w!=-1) {
					adjMatrix[i][j] = 1;  //1/0 
					adjWeight[i][j] = w;  //weight
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
	public int[] mst(int s) {  //start from 0 vertex
		int[]dist = new int[totalVertex];
		for(int i=1;i<totalVertex;i++) {
			dist[i]= Integer.MAX_VALUE;
		}
		dist[s]=0;
		for(int u=0;u<totalVertex;u++){
			int a = getUnsettledNearest(dist);
			LinkedList<Integer> nodes = getUnsettledNeighbors(a);  //get all unsettled neighbors
			Iterator<Integer> nodeList = nodes.iterator();
			while(nodeList.hasNext()) {
				int x = nodeList.next(); 
				dist[x] = Math.min(getWeight(a,x), dist[x]); //find the smaller one
			}
			ifSettled[a]=true;
		}
		return dist;
		/*
		int[]dist = new int[totalVertex];
		for(int i=1;i<totalVertex;i++) {
			dist[i]= Integer.MAX_VALUE;
		}
		dist[s]=0;
		for(int u=0;u<totalVertex;u++){
			int a = getUnsettledNearest(dist);
			LinkedList<Integer> nodes = getUnsettledNeighbors(a);  //get all unsettled neighbors
			Iterator<Integer> nodeList = nodes.iterator();
			int small = Integer.MAX_VALUE;
			while(nodeList.hasNext()) {
				int x = nodeList.next(); 
				dist[x] = Math.min(getWeight(a,x), dist[x]); //find the smaller one
			}
			ifSettled[a]=true;
		}
		return dist;*/
	}
}

public class Main {
	public static void main(String[] argv) {
		Graph1 g = new Graph1();
		g.loadAdjMatrix();
		int[] dist = g.mst(0);
		int cost=0;
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			//System.out.println(i + " " + dist[i]);
			cost = cost+dist[i];
		}
		System.out.println(cost);
	}
}


