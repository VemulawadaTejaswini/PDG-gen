import java.util.*;

class Graph1 {
	private int totalVertex;
	private LinkedList<LinkedList<Integer>> adjList;
	private int[] discover = new int[totalVertex];
	private int time;
	private boolean[] visit = new boolean[totalVertex];
	private int[] finish = new int[totalVertex];
	//adjacency list of edges
	public Graph1() { totalVertex = 0; }
	public void loadAdjList() {
		Scanner in = new Scanner(System.in);
		totalVertex = in.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		discover = new int[totalVertex];
		time = 0;
		visit = new boolean[totalVertex];
		finish = new int[totalVertex];
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
	public void dfs(int cur) {
	    discover[cur] = ++time;
	    visit[cur] = true;
	    int size = adjList.get(cur).size();
	    for (int i = 0; i < size;i++) {
	        int v = adjList.get(cur).get(i);
	        if (visit[v] == false) {
	            dfs(v);
	        }
	      }
	    finish[cur] = ++time;

	}
	
	public void print() {
		for (int i = 0; i < totalVertex;i++) {
            if(!visit[i]) {
            	dfs(i);
            }
        } 
        for (int i = 1; i <= totalVertex;i++) {
        	System.out.println(i + " " + discover[i-1] + " " + finish[i-1]);
        }
	}
}


public class Main {
	
	public static void main(String argv[]) {
		Graph1 g = new Graph1();
		g.loadAdjList();
		g.print();
	}

}

