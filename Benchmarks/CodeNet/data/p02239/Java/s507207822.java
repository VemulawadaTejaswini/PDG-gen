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
	
	public int[][] shortestPath() {
		ArrayList<Integer> visited = new ArrayList<>();
		visited.add(1);
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		int path = 0;
		int[][] result = new int[totalVertex][2];
		for(int k = 0; k < totalVertex; k++) {
			result[k][0] = k+1;
		}
		while(!q.isEmpty()) {
			int s = q.size();
			int[] temps = new int[q.size()];
			for(int i = 0; i < s; i++) {
				temps[i] = q.remove();
			}
			for(int l = 0; l < temps.length; l++) {
				result[temps[l]-1][1] = path;
				for(int j = 0; j < adjList.get(temps[l]-1).size(); j++) {
					int temp2 = adjList.get(temps[l]-1).get(j);
					if(!visited.contains(temp2+1)) {
						visited.add(temp2+1);
						q.add(temp2+1);
					}
				}
			}
			path +=1;
		}
		for(int n = 1; n < totalVertex; n++) {
			if(result[n][1] == 0) {
				result[n][1] = -1;
			}
		}
		return result;
	}
}

//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		int[][] result = g.shortestPath();
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
	}
}
