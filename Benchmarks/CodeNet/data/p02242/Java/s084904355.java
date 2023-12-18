
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	//Variables
	public int size;
	public int[][] graph;
	int[] distances;
	int currentV;
	
	public void printGraph() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(j == size - 1) {
					System.out.print(graph[i][j]);
				} else
					System.out.print(graph[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void dijkstra(int source) {
		
	
		// create a storage for all the distances
		distances = new int[size];
		
		//initialize their values
		for(int i = 0; i < size; i++) {
			distances[i] = Integer.MAX_VALUE;
		}
		
		ArrayList<Integer> S = new ArrayList<Integer>(size);
		for(int i = 0; i < size; i++) S.add(i);
		
		distances[source] = 0; // distance is 0 
		
		while(S.isEmpty() == false) {
			
			int closestV = getClosest(S);
	
			// mark it as visited
			S.remove(S.indexOf(closestV));
			
			
			
			LinkedList<Integer> neighbors = getNeighbors(closestV);
			
			for(int i = 0; i < neighbors.size(); i++) {
				int aNeighbor = neighbors.get(i);
				if(S.contains(aNeighbor))
					distances[aNeighbor] = Math.min(distances[aNeighbor], distances[closestV] + graph[closestV][aNeighbor]);
			}
		}
	}
	
	public void printDist() {
		for(int i = 0; i < size; i++) {
			System.out.println(i + " " + distances[i]);
		}
	}
	
	public LinkedList<Integer> getNeighbors(int v){
		LinkedList<Integer> ns = new LinkedList<Integer>();
		for(int i = 0; i < size; i++) {
			if(graph[v][i] > 0)
				ns.add(i);
		}
		
		return ns;
	}
	
	public int getClosest(ArrayList<Integer> vertexList) {
		int v = vertexList.get(0);
		double minDist = distances[v];
		
		for(int i = 1; i < vertexList.size();i++) {
			if(distances[vertexList.get(i)] < minDist) {
				v = vertexList.get(i);
				minDist = distances[vertexList.get(i)];
			}
		}
		return v;
		
	}
	public static void main(String[] args) {
		
		Main s = new Main();
		
		Scanner in = new Scanner(System.in);
		
		s.size = in.nextInt();
		s.graph = new int[s.size][s.size];
		
		// create graph
		for(int i = 0; i < s.size; i++) {
			int u = in.nextInt();
			int kDegrees = in.nextInt();
			
			for(int k = 1; k <= kDegrees; k++) {
				int v = in.nextInt();
				int weight = in.nextInt();
				s.graph[u][v] = weight;
			}
		}
		

		s.dijkstra(0);
		
		s.printDist();
		
	}

}

