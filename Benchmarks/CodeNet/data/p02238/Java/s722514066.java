import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph {
	private int totalVertex;
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
    
    public void DFS() {
        int time = 1;
        int[] discovered = new int[totalVertex];
        int[] finished = new int[totalVertex];

        for (int i = 0; i < totalVertex; i++) {
            if (discovered[i] == 0) {
                time = DFSHelper(i, time, discovered, finished) + 1;
            }
        }

        for (int i = 0; i < totalVertex; i++) {
            System.out.println((i + 1) + " " + discovered[i] + " " + finished[i]);
        }
    }

    public int DFSHelper(int vertex, int timestamp, int[] discovered, int[] finished) {
        discovered[vertex] = timestamp;

        LinkedList<Integer> neighbors = adjList.get(vertex);
        for (Integer n : neighbors) {
            if (discovered[n] == 0) {
                timestamp = DFSHelper(n, ++timestamp, discovered, finished);
            }
        }

        finished[vertex] = timestamp + 1;
        return finished[vertex];
    }
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
        g.DFS();
	}
}
