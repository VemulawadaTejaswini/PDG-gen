//template code, C343, 2019
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	int[] discover;
	int[] finish;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		discover = new int[totalVertex];
		finish = new int[totalVertex];
		for(int i = 0; i < discover.length; i++) {
			discover[i] = -1;
			finish[i] = -1;
		}
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
	public void printAdjMatrix() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		//complete the following
		for(int i = 0; i < totalVertex; i++) {
			for(int j = 0; j < totalVertex; j++) {
				adjMatrix[i][j] = 0;
			}
		}
		for(int i = 0; i < totalVertex; i++) {
			for(int j = 0; j < adjList.get(i).size(); j++) {
					adjMatrix[i][adjList.get(i).get(j)] = 1;
			}
		}
		for(int i = 0; i < totalVertex; i++) {
			for(int j = 0; j < totalVertex - 1; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println(adjMatrix[i][totalVertex - 1]);
		}
	}
	
	public int dfs(int t, int n) {
		discover[n] = t;
		LinkedList<Integer> nb = adjList.get(n);
		Iterator<Integer> it = nb.iterator();
		int time = t;
		while(it.hasNext()) {
			int w = it.next();
			if(discover[w] == -1) {
				time ++; //one forward step
				time = dfs(time, w);
			}
		}
		finish[n] = time + 1; //+1 for backtrack step
		return time + 1;
		
	}
	
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.dfs(0, 0);
		int time = 0;
		for(int i = 0; i < g.finish.length; i++) {
			if(g.finish[i] > time) {
				time = g.finish[i] + 1;
			}
		}
		for(int i = 0; i < g.discover.length; i++) {
			if(g.discover[i] == -1) {
				time = g.dfs(time, i);
				time ++;
			}
				System.out.print((i + 1) + " " + (g.discover[i] + 1) + " " +  (g.finish[i] + 1));
				System.out.println();
		}
	}

}
