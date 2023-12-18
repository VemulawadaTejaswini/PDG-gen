import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Graph {
	public int totalVertex;
	private int count=0;
	private LinkedList<LinkedList<Integer>> adjList;
	public LinkedList<Integer> visited;
	public LinkedList<LinkedList<Integer>> output;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		output = new LinkedList<LinkedList<Integer>>();
		visited = new LinkedList<Integer>();
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			output.add(new LinkedList<Integer>());
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
	
	public void preVisit(int v) {
		output.get(v).add(++count);
	}
	
	public void setVisited(int v) {
		visited.add(v);
	}
	
	public void postVisit(int v) {
		output.get(v).add(++count);
	}
	
	public boolean ifVisited(int v) {
		return visited.contains(v);
	}
	
	public List<Integer> getNeighbors(int v){
		return adjList.get(v);
	}

	public void DFS(int v) {
		preVisit(v);
		setVisited(v);
		List<Integer> neighbors = getNeighbors(v);
		for(int i=0;i<neighbors.size();i++) {
			int v1 = neighbors.get(i);
			if(ifVisited(v1)==false) {
				DFS(v1);
			}
		}
		postVisit(v);
	}
}

public class Main {

	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.DFS(0);
		for(int i=0;i<g.totalVertex;i++) {
			if(!g.visited.contains(i)) {
				g.DFS(i);
			}
		}
		for(int i=0;i<g.output.size();i++) {
			System.out.println(i+1+" "+g.output.get(i).get(0)+" "+g.output.get(i).get(1));
		}
	}

}
