import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public int getTotalVertex() { return totalVertex; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1; //-1, index
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1; //-1, index
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public int[] computeDistDFS(int s) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.add(s);
		int[] visited = new int[totalVertex];
		int[] dist = new int[totalVertex];
		int v, u;
		for(v = 0; v < totalVertex; v ++) {
			visited[v] = 0; 
			dist[v] = -1; 
		}
		dist[s] = 0;
		visited[s] = 1;
		while(!q.isEmpty()) {
			u = q.remove(0); //remove the first item from the list/queue
			Iterator<Integer> it = adjList.get(u).iterator();
			while(it.hasNext()) {
				v = it.next();
				if(visited[v] == 0) {
					q.add(v); //add to the end of the list/queue
					dist[v] = dist[u] + 1;
					visited[v] = 1;
				}
			}
		}
		return dist;
	}
}

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		int[] dist = g.computeDistDFS(0);
		for(int i = 0; i < g.getTotalVertex(); i ++) {
			System.out.println((i+1) + " " + dist[i]);
		}
	}
}
