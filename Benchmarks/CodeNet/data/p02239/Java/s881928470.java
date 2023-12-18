import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

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
	public void printShortestDist() {
		Integer[][] adjMatrix = new Integer[totalVertex][totalVertex];
		Iterator<LinkedList<Integer>> it = adjList.iterator();
		int num = 0;
		while(it.hasNext()) {
			LinkedList<Integer> c = it.next();
			Iterator<Integer> it2 = c.iterator();
			
			while(it2.hasNext()){
				adjMatrix[num][it2.next()] = 1; 
			}
			num++;
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		int[] neighbor = new int[totalVertex];
		for(int h = 0; h<neighbor.length;h++) {
			if(h==0) {neighbor[0] = 0;}
			else{neighbor[h]= -1;}
			}
		q.add(0);
			while(!q.isEmpty()) 
			{
				int tmpidx = q.poll();
				LinkedList<Integer> tmp = adjList.get(tmpidx);
				for (int l=0; l<tmp.size(); l++)
					{
					int f = tmp.get(l);
					if(neighbor[f] ==-1) {q.add(f);neighbor[f] = neighbor[tmpidx]+1;}
					} 
				
				
			}
			
			for (int k=0; k<totalVertex; k++) {
				System.out.println((k+1) + " " + neighbor[k]);
			}
		}
			
		
	}


//change class name GraphRepresentation to Main() for submission to AIZU
public class Main {
	public static void main(String argv[]) {
		Graph g = new Graph();
		g.loadAdjList();
		g.printShortestDist();
	}
}


