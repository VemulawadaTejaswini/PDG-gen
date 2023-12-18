import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.call_DFS(0);
		boolean[] if_visited = g.getVisited();
		for (int i = 0; i < if_visited.length; i++) {
			if (if_visited[i] == false) {
				g.call_DFS(i);
			}
		}
		g.show_result();
	}
}

class Graph {
	
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private boolean[] if_visited;
	private int[] discover_time;
	private int[] complete_time;
	private int[] id;
	private static int timestamp = 1;
	
	public boolean[] getVisited() {
		return if_visited;
	}
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		if_visited = new boolean[totalVertex];
		discover_time = new int[totalVertex];
		complete_time = new int[totalVertex];
		id = new int[totalVertex];
		
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			if_visited[idx1] = false;
			id[idx1] = i;
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
	
	public void DFS(int id) {
		if(!if_visited[id]) {
			if_visited[id] = true;
			discover_time[id] = timestamp;
			timestamp += 1;
			Iterator<Integer> i = adjList.get(id).listIterator();
			while(i.hasNext()) {
				int n = i.next();
				DFS(n);
			}
			complete_time[id] = timestamp++;
		}else {
			
		}
		
	}
	
	public void call_DFS(int id) {
		DFS(id);
	}
	
	
	public void show_result() {
		for (int i = 0; i < totalVertex; i++) {
			System.out.print(id[i] + 1 + " ");
			System.out.print(discover_time[id[i]] + " ");
			System.out.println(complete_time[id[i]]);
		}
	}
	
}
