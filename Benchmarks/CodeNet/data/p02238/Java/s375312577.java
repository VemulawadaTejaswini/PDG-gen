import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
	//template code, C343, 2019


	static class Graph {
		int timer = 1;
		
		
		private int totalVertex;
		
		ArrayList<Integer> visitHistory = new ArrayList<Integer>();
		

		
		private LinkedList<LinkedList<Integer>> adjList;
		//adjacency list of edges
		
		public Graph() { totalVertex = 0; }
		
		public void loadAdjList() {
			
			Scanner in = new Scanner(System.in);
			totalVertex = in.nextInt();
			adjList = new LinkedList<LinkedList<Integer>>();
			
			for(int i = 0; i < totalVertex; i ++) {
				
				LinkedList<Integer> tmp = new LinkedList<Integer>();
				int idx1 = in.nextInt() - 1;
				int degree = in.nextInt();
				
				//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
				for(int j = 0; j < degree; j ++) {
					int idx2 = in.nextInt() - 1;
					tmp.add(idx2);
				}	
				
				adjList.add(tmp);
			}
			
			in.close();
		}
		
		//do an iterator
		//ID, neighbor, actual neighbors following neighbors
		public void printAdjMatrix() {
			int[][] adjMatrix = new int[totalVertex][totalVertex];
			
			Iterator<LinkedList<Integer>> iter = adjList.iterator();
			
			
			
			for(int i = 0; i < adjList.size(); i++) {
				LinkedList<Integer> currList = iter.next();
				Iterator<Integer> currListIter = currList.iterator();
				
				for(int j = 0; j < currList.size(); j++) {
					adjMatrix[i][currList.get(j)] = 1; 
				}
			}
			
			for(int k = 0; k < adjList.size(); k++) {
				for(int l = 0; l < adjList.size(); l++) {
					if(l < adjList.size()-1) {
						System.out.print(adjMatrix[k][l] + " ");
					} else if(l == adjList.size()-1) {
						System.out.print(adjMatrix[k][l]);
						System.out.println();
					}
				}
			}
		}
		
		
		
		public void DFS() {
			int[] d = new int[totalVertex];
			int[] f = new int[totalVertex];
			for(int i = 0; i < totalVertex; i++) {
				if(!visited(i)) {
					DFS(i, d, f);
				}
				System.out.println(i+1 + " " + d[i] + " " + f[i]);
			}
			
		}
		
		public void DFS(int v, int[] d, int[] f) {
			d[v] = timer++;
			
			//setVisited thingy
			visitHistory.add(v);
			
			
			LinkedList<Integer> neighbors = getNeighbors(v, adjList);
			for(int i = 0; i < neighbors.size(); i++) {
				int v1 = neighbors.get(i);
				if(visited(v1) == false) {
					DFS(v1, d, f);
				}
			}
		
			f[v] = timer++;
			
		}
		
		public boolean visited(int v) {
			if(visitHistory.contains(v)) {
				return true;
			} else if(!visitHistory.contains(v)) {
				return false;
			} else {
				return false;
			}
		}
		
		public LinkedList<Integer> getNeighbors(int v, LinkedList<LinkedList<Integer>> topList) {
			return topList.get(v);
			
			//return null;
			
		}
		
			
		
		
	}
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.DFS();
	}

}


