import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private int totalVertex;
	private int totalEdges;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Main() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdges = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i < totalVertex; i++) {
			adjList.add(new LinkedList<Integer>());
		}
		
		for (int i = 0; i < totalEdges; i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			LinkedList<Integer> tmp = adjList.get(s);
			tmp.add(t);
		}
		
		in.close();
	}
	
	public LinkedList<Integer> getTopSort() {
		LinkedList<Integer> L = new LinkedList<Integer>();
		int[] C = new int[totalVertex];
		LinkedList<Integer> Q = new LinkedList<Integer>();
		
		
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> neighbors = adjList.get(i);
			for (int j : neighbors) {
				C[j]++;
			}
		}
		
		for (int i = 0; i < totalVertex; i++) {
			if (C[i] == 0) {
				Q.add(i);
			}
		}
		while (Q.size() > 0) {
			int u = Q.remove(0);
			L.add(u);
			LinkedList<Integer> neighbors = adjList.get(u);
			for (int v : neighbors) {
				C[v]--;
				if (C[v] == 0) {
					Q.add(v);
				}
			}
		}
		return L;
	}
	
	public static void main(String args[]) {
		Main s = new Main();
		s.loadAdjList();
		LinkedList<Integer> result = s.getTopSort();
		for (Integer i : result) {
			System.out.println(i);
		}
	}
}

