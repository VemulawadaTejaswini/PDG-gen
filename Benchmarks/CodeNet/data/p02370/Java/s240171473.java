
import java.util.*;
public class Main {
	public static void main(String[] args) {
		NewGraph g = new NewGraph();
		g.loadAdjList();
		g.topSort();
	}
}

class NewGraph {
	private int totalVertex;
	private int totalEdge;
	LinkedList<LinkedList<Integer>> adjList;
	//adjacency list of edges
	public NewGraph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		totalEdge = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
		}
		
		for(int i = 0; i < totalEdge; i++) {
			int base = in.nextInt();
			int end = in.nextInt();
			adjList.get(base).add(end);
		}
		
		in.close();
	}
	
	public void topSort() {
		Stack<Integer> stack = new Stack<>();
		
		boolean[] visted = new boolean[totalVertex];
		
		for (int i = 0; i < totalVertex; i ++) {
			if (visted[i] == false) {
				topSortRecur(i, visted, stack);
			}
		}
		
		while(stack.isEmpty() == false) {
			System.out.println(stack.pop());
		}
	}
	
	public void topSortRecur(int tgt, boolean[] visted, Stack<Integer> stack) {
		visted[tgt] = true;
		List<Integer> tgtlist = adjList.get(tgt);
		for(int i = 0; i < tgtlist.size(); i++) {
			if (visted[tgtlist.get(i)] == false) {
				topSortRecur(tgtlist.get(i), visted, stack);
			}
		}
		
		stack.push(tgt);
	}
}
