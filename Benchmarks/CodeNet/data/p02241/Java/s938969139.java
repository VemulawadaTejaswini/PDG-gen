
import java.util.*;


public class Main {
	
	
	public static void main(String[] argv) {
		Graph g = new Graph();
		g.loadAdjMatrix();
		System.out.println(g.prim(0));
	}
	
	
	
	
	
	
	static class Graph {
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
			
			for(i = 0; i < totalVertex; i ++) {
				for(j = 0; j < totalVertex; j ++) {
					int v = in.nextInt(); 
					if (v > -1) {
						adjMatrix[i][j] = 1;
						
					}
					adjWeight[i][j] = v;
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
		public int prim(int s) {
			int out = 0;
			
			//distances to 0 from item id at index
			int[] distancesSoFar = new int[totalVertex];
			distancesSoFar[0] = 0;
			for (int i = 1; i < distancesSoFar.length; i++) {
				distancesSoFar[i] = Integer.MAX_VALUE;
			}
			
			while(isDone() == false) {
				int tgt = getUnsettledNearest(distancesSoFar);
				LinkedList<Integer> items = getUnsettledNeighbors(tgt);
				
				for (int i = 0; i < items.size(); i++) {
					int childindex = items.get(i);
					
					distancesSoFar[childindex] = Integer.min(distancesSoFar[childindex], getWeight(tgt, childindex));
				}
				
				ifSettled[tgt] = true;
				
			}
			
			for(int i = 0; i < distancesSoFar.length; i++) {
				out += distancesSoFar[i];
			}
			return out;
		}
		
		private boolean isDone() {
			for(int i = 0; i < ifSettled.length; i++) {
				if (ifSettled[i] == false) {
					return false;
				}
			}
			
			return true;
		}
		
		private int minIndex(int[] arr) {
			int output = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min && !ifSettled[i]){
					output = i;
					min = arr[i];
				}
			}
			
			return output;
		}
	}
}

