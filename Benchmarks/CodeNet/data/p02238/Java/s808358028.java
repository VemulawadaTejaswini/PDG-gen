import java.util.*;

class Graph {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	
	//adjacency list of edges
	public Graph() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		start = new int[totalVertex];
		t = 1;
		visit = new boolean[totalVertex];
		finish = new int[totalVertex];
		for(int i = 0; i < totalVertex; i ++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int idx1 = in.nextInt() - 1;
			int degree = in.nextInt();
			for(int j = 0; j < degree; j ++) {
				int idx2 = in.nextInt() - 1;
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	private int[] start = new int[totalVertex];
	private int t;
	private boolean[] visit = new boolean[totalVertex];
	private int[] finish = new int[totalVertex];
	
	public void DFS(int i) {
	    start[i] = t++;
	    visit[i] = true;
	    for (int j = 0; j < adjList.get(i).size();j++) {
	        int v = adjList.get(i).get(j);
	        if (visit[v] == false) {
	            DFS(v);
	        }//if
	      }//for
	    finish[i] = t++;

	}//DFS
	
	public void print() {
		for (int i = 0; i < totalVertex;i++) {
			//if it has not been visited dfs
            if(visit[i] == false) {
            	DFS(i);
            }//if
        }//FOR 
        for (int i = 1; i <= totalVertex;i++) {
        	System.out.println(i + " " + start[i-1] + " " + finish[i-1]);
        }//FOR
	}//print
}//graph


public class Main {
	
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.print();
	}//main

}//class

