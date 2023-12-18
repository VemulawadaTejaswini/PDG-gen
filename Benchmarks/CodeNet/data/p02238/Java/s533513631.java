import java.util.*;
class Graph2{
	private int totalVertex;
	boolean[] explore;
	int[] firstDisc;
	int[] endTime;
	int count = 0;
	private LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public Graph2() { totalVertex = 0; }
	
	public LinkedList<LinkedList<Integer>> loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		explore = new boolean[totalVertex+1];
		firstDisc = new int[totalVertex+1];
		endTime = new int[totalVertex+1];
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt();
			int degree = in.nextInt();
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt();
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
		return adjList;
	}

	public void recurse(LinkedList<LinkedList<Integer>> G, int v) {
		if(!explore[v]) {
			explore[v] = true;
			count++;
			firstDisc[v] = count;
			for(int e : G.get(v-1)) {
				recurse(G, e);
			}
			count++;
			endTime[v] = count;
		}
		
	}

	void print() {
		for(int i = 1; i <= totalVertex; i++) {
			System.out.println(i +" "+ firstDisc[i] + " " + endTime[i]) ;
		}
	}
}
//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		LinkedList<LinkedList<Integer>> matrix = g.loadAdjList();
		for(int i = 1; i <= matrix.size(); i++) {
			g.recurse(matrix, i);
		}
		g.print();
	}
}
