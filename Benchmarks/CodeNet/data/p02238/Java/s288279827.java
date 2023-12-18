
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

class Graph2 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	private int[] discover; //discover time stamp, -1 for undiscovered
	private int[] finish; //finish time stamp
	public Graph2() { totalVertex = 0; }
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
	public int DFS(int v, int t0) {
		discover[v] = t0;
		LinkedList<Integer> nb = adjList.get(v);
		Iterator<Integer> it = nb.iterator();
		int t = t0;
		while(it.hasNext()) {
			int w = it.next();
			if(discover[w] == -1) {
				t ++; //one forward step
				t = DFS(w, t);
			}
		}
		finish[v] = t + 1; //+1 for backtrack step
		return t + 1;
	}
	public void timeStamp() {
		int v;
		discover = new int[totalVertex];
		finish = new int[totalVertex];
		for(v = 0; v < totalVertex; v ++) discover[v] = -1; //-1: not discovered
		int t = 0;
		for(v = 0; v < totalVertex; v ++) {
			if(discover[v] == -1) { //for disconnected graph, restart from an unvisited node
				t = DFS(v, t);
				t ++;
			}
		}
		//display the result
		for(v = 0; v < totalVertex; v ++) {
			System.out.println((v + 1) + " " + (discover[v] + 1) + " " + (finish[v] + 1));
			//+1, node 0 -> 1, 1 -> 2, etc
		}
	}
}

	
public class Main {

	public static void main(String[] args) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		g.timeStamp();

	}

}
//答案
