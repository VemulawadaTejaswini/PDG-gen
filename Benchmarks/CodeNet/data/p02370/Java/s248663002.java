import java.util.*;


class Graph2 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private boolean[] visited = new boolean[totalVertex];
	private int[] indegree = new int[totalVertex];
	public Graph2() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		visited = new boolean[totalVertex];
		indegree = new int[totalVertex];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false ;
		}
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			adjList.add(tmp);
			}
		int totalEdge = in.nextInt();
		for (int i = 0; i < totalEdge; i++) {
			int root = in.nextInt(); //get the root
			int node = in.nextInt(); //get the node root connect to
			adjList.get(root).add(node); //add the node to
			indegree[node]++; // update the indegree of the node
		}
		in.close();
	}
	LinkedList<Integer> result = new LinkedList<Integer>();
	public void DFS(int v) {
		LinkedList<Integer> nb = adjList.get(v);
		for(Integer i : nb) {
			if(visited[i] == false) {
				visited[i] = true;
				DFS(i);
			}
		}
		result.addFirst(v);
		}

	public void toposort() {
		for (int i = 0; i < totalVertex; i++) {
			if(indegree[i] == 0) {
				DFS(i);
			}
		}
		for(Integer i : result)
	        System.out.println(i);
	}
}

public class Main {
	public static void main(String argv[]) {
		Graph2 g = new Graph2();
		g.loadAdjList();
		g.toposort();
	}

}
