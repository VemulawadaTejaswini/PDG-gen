//package lab12;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph {
	
	
	
	//arraylist for dijkstras
	ArrayList<Integer> S = new ArrayList<Integer>();
	public int distSize;
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
			u = i;
			for(j = 0; j < totalVertex; j ++) {
				v = j; 
				int input = in.nextInt();
				if(input == -1) {
					adjMatrix[u][v] = 0;
				} else {
					adjMatrix[u][v] = 1;
				}
				//System.out.println("matrix: " + adjMatrix[u][v]);
				if(in.hasNextLine()) {
					adjWeight[u][v] = input;
				}
				//System.out.println("weight: " + adjWeight[u][v]);
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
		LinkedList<Integer> neighbors = new LinkedList<Integer>();
		int[] dist = new int[totalVertex];
		
		dist[s] = 0;
		
		for(int i = 0; i < totalVertex; i++) {
			if(i != s) {
				dist[i] = 999999999;
			}
		}
		while(S.size() < totalVertex) {
			int v = getUnsettledNearest(dist);
		
			neighbors = getUnsettledNeighbors(v);
			
			for(int i = 0; i < neighbors.size(); i++) {
				int x = neighbors.get(i);
				dist[x] = Math.min(getWeight(v, x), dist[x]);
			}
			S.add(v);
			ifSettled[v] = true;
			
		}
		
		return dist;
		
	}
}

public class Main {
	public static void main(String[] argv) {
		int sum = 0;
		Graph g = new Graph();
		g.loadAdjMatrix();
		int[] dist = g.Dijkstra(0);
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			if(dist[i] != 999999999) {
				sum += dist[i];
			}
			
		}
		System.out.println(sum);
		
	}
}
