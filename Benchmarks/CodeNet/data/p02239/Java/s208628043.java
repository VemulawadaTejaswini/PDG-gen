
import java.util.Iterator;
//BFS find the short path for all nodes
/*
 * BFS(s): 
   toVisit = {s} //toVisit is a queue
   while toVisit is not empty:
       u = toVisit.dequeue()
       for u's every unvisited neighbor v:
	  toVisit.enqueue(v)
          dist[v] = ?? //complete it to solve the shortest path problem
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
			int idx1 = in.nextInt() - 1; //we need 0123 not 1234
			int degree = in.nextInt(); //degree 2 number
			//System.out.println("mark idx1 = " + idx1 + " degree = " + degree);
			for(int j = 0; j < degree; j ++) { //degree: how many edges we have point to the node/number
				int idx2 = in.nextInt() - 1; //coz every node -1
				tmp.add(idx2);
			}	
			adjList.add(tmp);
		}
		in.close();
	}
	
	public void BFS() {
		int [] visited = new int[totalVertex];
		int [] path = new int[totalVertex];
		for(int y=0;y<totalVertex;y++) {
			visited[y] = 0;   //table visit all 0
			path[y] = -1; //set a large number
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0]=1; //bug
		path[0]=0;//bug
		while(!q.isEmpty()) {
			int x = q.poll();  //current parent
			LinkedList<Integer> nb = adjList.get(x);
			Iterator<Integer> it = nb.iterator();
			while(it.hasNext()) {
				int t = it.next();
				if(visited[t]==0) {
					if (path[x]==-1) path[x]=0;
					path[t] = path[x]+1; //parent +1
					visited[t] = 1;
					q.add(t); //add
				}
			}
		}
		for (int s=0;s<totalVertex;s++) {
			System.out.println(s+1 + " " + path[s]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Graph g = new Graph();
		g.loadAdjList();
		g.BFS();
	}

}

