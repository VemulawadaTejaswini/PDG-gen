import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private Integer[][] graph;
	private boolean[][] g;
	private int[] d,f;
	private int time = 0;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		g = new boolean[totalVertex][totalVertex];
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
				g[idx1][idx2] = true;
			}	
			adjList.add(tmp);
		}
		in.close();
		
		d = new int[totalVertex];
		f = new int[totalVertex];
		
		graph = new Integer[totalVertex][totalVertex];
		for(int i = 0; i < totalVertex; i++) {
			for(int x = 0; x < totalVertex; x++) {
				graph[i][x] = 0;
			}
		}
		for(int i = 0; i < adjList.size(); i++) {
			LinkedList<Integer> curr = adjList.get(i);
			for(int x = 0; x < curr.size(); x++) {
				graph[i][curr.get(x)] = 1;
			}
		}
		
		dfs(0);
		for (int i = 0; i < totalVertex; i++)
			if (d[i] == 0)
				dfs(i);
		for(int i = 0;i < totalVertex;i++){
            System.out.println((i + 1) + " " + d[i] + " " + f[i]);
        }
	}
	public void printAdjMatrix() {
		for(int i = 0; i < totalVertex; i++) {
			for(int x = 0; x < totalVertex; x++) {
				if(x != totalVertex - 1) System.out.print(graph[i][x] + " ");
					else System.out.print(graph[i][x]);
			}
			System.out.println();
		}
	}
	public void dfs(int u) {
		if (d[u] > 0 || f[u] > 0)
			return;

		d[u] = ++time;
		for (int i = 0; i < totalVertex; i++)
			if (g[u][i])
				dfs(i);
		f[u] = ++time;
	}
}
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
//		g.printAdjMatrix();
	}
}
