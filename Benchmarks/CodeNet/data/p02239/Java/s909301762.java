
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] visited;
	private int[] distance;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		visited = new int[totalVertex];
		distance = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public void BFS(int s) {
	    LinkedList<Integer> toVisit = new LinkedList<Integer>();
	    toVisit.add(s);
	    for(int i=0; i<totalVertex; i++) {
	    	distance[i] = -1;
	    }
	    visited[s] = 1;
	    distance[s] = 0;
	    while(toVisit.size() > 0) {
	        //first-in, first-visit; if queue is used, use its dequeue() function
	        int v = toVisit.remove(0); 
	        //setVisited(v);
	        visited[v]=1;
	        List<Integer> neighbors = adjList.get(v);//getNeighbors(v);
	        for(int i = 0; i < neighbors.size(); i ++) {
	            int v1 = neighbors.get(i);
	            if(visited[v1] == 0) {
	                toVisit.add(v1);
	                visited[v1] = 1;
	                distance[v1] = distance[v] + 1;
	            }
	            //System.out.println(s + " " + distance[v1]);
	            }
	        }
	    for(int i=0; i<totalVertex; i++) {
	    	System.out.println(i+1 + " " + distance[i]);
	    }
	}
}
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS(0);
	}
}
