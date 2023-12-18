
/*
 * Blake Miller
 * Implementation of Graph
 * Returns a graph visualization with 1s and 0s in positions where there is a connection
 * From AIZU and yye
 * 
 * 
 * 
 * NOW implements an inefficient connection system!
 * Works for smaller numbers
 * 
 * NOW works for Single Source Shortest Path!
 */
/*
 * 
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	static TreeSet<Integer> visited = new TreeSet<Integer>();
	static int[] visitTimes = new int[101];
	static int[] finishTimes = new int[101];
	int[][] graph;
	Stack<Integer> toVisit;
	int verts;
	int[] dist;
	static int time;
	public Main(int[][] graph) {
		this.graph = graph;
		this.dist = new int[graph.length];
		time = 0;
		toVisit = new Stack<Integer>();
		verts = Array.getLength(this.graph[0]);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //number of nodes
		int[][] myGraph = new int[n][n]; //assume n x n graph
		int[] dist = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				myGraph[i][j] = 100001;
			}
		}
		myGraph[0][0] = 0;
		for (int i = 0; i < n; i++) {
			int p = in.nextInt();
			int q = in.nextInt();
			for (int j = 0; j < q; j++) {
				int vert = in.nextInt();
				myGraph[i][vert] = in.nextInt();
			}
			
			
		}
		Main newGraph = new Main(myGraph);
		newGraph.printDist(newGraph.dijkstra());
		
		
	}
	public int minValue(int s, TreeSet<Integer> S) {
		int min = 100001;
		int spot = 0;
		for (int i = 0; i < graph[0].length; i++) {
			System.out.println(i);
			if (graph[s][i] < min) {
				if (!S.contains(i)) {
					
					min = graph[s][i];
					spot = i;
				}
			}
		}
		System.out.println(spot + " spot");
		return spot;
	}
	
	public void dijPath() {
		int s = 0;
		TreeSet<Integer> S = new TreeSet<Integer>();
		dist[s] = 0;
		for (int i = 1; i < dist.length; i++) {
			dist[i] = 100001;
		}
		printDist(dist);
		printArray();
		S.add(s);
		int v = minValue(s, S);
		while (S.size() < graph[0].length) {
			
			for (int i = 0; i < graph[0].length;i++) {
				if (graph[v][i] != 100001) {
					dist[i] = Math.min(dist[v] + graph[v][i], dist[i]);
				}
			}
			S.add(v);
			v = minValue(v, S);
			printDist(dist);
		}
		
		
	}
	public int minimum(int[] row, TreeSet<Integer> S) {
		int minimum = 100001;
		int spot = 100001;
		for (int i = 0; i < row.length; i++) {
			if (row[i] < minimum && !S.contains(i)) {
				spot = i;
				minimum = row[i];
			}
		}
		return spot;
	}
	public int[] dijkstra() {
		TreeSet<Integer> S = new TreeSet<Integer>();
		int[] dist = new int[graph.length];
		dist[0] = 0;
		for (int i = 1; i < graph.length; i++) {
			dist[i] = 100001;
		}
		while (S.size() < graph.length) {
			int v = minimum(graph[0], S);
			if (v > 100000) {
				return dist;
			}
			for (int i = 0; i < graph.length; i++) {
				if (graph[v][i] != 100001) {
					dist[i] = Math.min(dist[v] + graph[v][i], dist[i]);
				}
			}
			S.add(v);
		}
		System.out.println(S.toString());
		return dist;
	}
	
	public void printDist(int[] dist) {
		for (int i = 0; i < dist.length; i++) {
			System.out.println(i + " " + dist[i]);
		}
	}
	public void printArray() {
		for (int i = 0; i < graph[0].length; i++) {
			System.out.print(i+ ": ");
			for (int j = 0; j < graph[0].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void printSearch() {
		for (int i = 0; i < verts; i++) {
			System.out.println(i+1 + " " + visitTimes[i] + " " + finishTimes[i]);
		}
	}
	
	public void depthSearch(int row, int goal) {
		Stack<Integer> vertices = new Stack<Integer>();
		if (!visited.contains(row)) {
			
			visited.add(row);
			
			for (int i = 0; i < verts ; i++) {
				if (this.graph[row][i] == 1) {
					if (i == goal) {
						visited.add(i);
						return;
					}
					depthSearch(i, goal);
				}
			}
			
			
			
		}
	}
	public boolean binSearch(int row, int goal) {
		visited = new TreeSet<Integer>();
		depthSearch(row, goal);
		return (visited.contains(goal));
	}
	

	
	
	
}

