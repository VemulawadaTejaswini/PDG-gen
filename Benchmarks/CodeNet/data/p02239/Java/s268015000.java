import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
		private int totalVertex;
		private LinkedList<LinkedList<Integer>> adjList;
		//adjacency list of edges
		public Main() { 
			totalVertex = 0; 
		}
		public void loadAdjList() {
			Scanner in = new Scanner(System.in);
			totalVertex = in.nextInt();
			adjList = new LinkedList<LinkedList<Integer>>();
			for(int i = 0; i < totalVertex; i ++) {
				LinkedList<Integer> tmp = new LinkedList<Integer>();
				int idx1 = in.nextInt() - 1;//idx1 is basically i, so just use i 
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
		public int[] distance()
		{
			int[] visited = new int[totalVertex];
			int[] distance = new int[totalVertex];
			for(int i = 0; i < totalVertex ;i++)
			{
				distance[i] = -1 ;
			}
			ArrayList<Integer> toVisit = new ArrayList<Integer>();
			toVisit.add(0);
			distance[0] = 0;
			while(toVisit.size() > 0)
			{
				int v = toVisit.remove(0);
				visited[v] = 1;
				LinkedList<Integer> neighbors = adjList.get(v);
				for(int i = 0; i < neighbors.size() ; i++)
				{
					int v1 = neighbors.get(i);
					if(visited[v1] == 0 && toVisit.contains(v1) == false)
					{
						toVisit.add(v1);
						distance[v1] = distance[v] + 1;
						visited[v1] = 1;
					}
				}
			}
			return distance;
		}
		public static void main(String[] args)
		{
			Main erik = new Main();
			erik.loadAdjList();
			int[] dist = erik.distance();
			for(int i = 0 ; i < erik.totalVertex ; i++)
			{
				System.out.println( (i+1) + " " + dist[i]);
			}
		}	
	}
	
