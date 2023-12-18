import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;

	public Graph() {
		totalVertex = 0;
	}

	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i < totalVertex; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for (int j = 0; j < degree; j++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}
			adjList.add(tmp);
		}
		in.close();
	}
	
	private int[] previsit = new int[totalVertex];
	private int[] postvisit = previsit;
	public int DFShelper(int vertex, int time) {
		previsit[vertex] = time;
		LinkedList<Integer> list = adjList.get(vertex);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int temp = iterator.next();
			if (previsit[temp] == Integer.MIN_VALUE) {
				time++;
				time = DFShelper(temp, time);
			}
		}
		postvisit[vertex] = time + 1;
		return time + 1;
		
	}
	public void DFS () {
		previsit = new int[totalVertex];
		postvisit = new int[totalVertex];
		int time = 0;
		for (int i = 0; i < totalVertex; i++)
			previsit[i] = Integer.MIN_VALUE;
		for (int i = 0; i < totalVertex; i++)
			if (previsit[i] == Integer.MIN_VALUE)
				time = DFShelper(i, time) + 1;
		display(previsit, postvisit);
	}
	
	public void display (int[] previsit, int[] postvisit) {
		for (int i = 0; i < totalVertex; i++)
			System.out.println((i+1)+" "+(previsit[i]+1)+" "+(postvisit[i]+1));
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.DFS();
	}
}

