import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Graph {
	public int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	public LinkedList<Integer> visited;
	public LinkedList<Integer> count;
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		visited = new LinkedList<Integer>();
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
	
	public boolean ifVisited(int v) {
		return visited.contains(v);
	}
	
	public void setVisited(int v) {
		visited.add(v);
	}
	
	public List<Integer> getNeighbors(int v){
		return adjList.get(v);
	}
	
	public void BFS(int s) {
		ArrayList<Integer> toVisit = new ArrayList<Integer>();
		toVisit.add(s);
		
		count = new LinkedList<Integer>();
		for(int i=0;i<totalVertex;i++) {
			count.add(i, -1);
		}
		count.set(0, 0);
		
		
		while(toVisit.size()>0) {
			int v = toVisit.remove(0);
			setVisited(v);
			List<Integer> neighbors = getNeighbors(v);
			for(int i=0;i<neighbors.size();i++) {
				int v1 = neighbors.get(i);
				
				if((ifVisited(v1)==false)&&(toVisit.contains(v1)==false)) {
					toVisit.add(v1);
					count.set(v1, count.get(v)+1);
				}
				
			}
		}
	}
		

}



public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS(0);
		
		for(int i=0;i<g.totalVertex;i++) {
			System.out.println(i+1+" "+g.count.get(i));
		}
	}
}
