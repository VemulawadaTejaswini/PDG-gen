import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Main{
	private static LinkedList<LinkedList<Integer>> adjList;
	private Scanner input;
	
	public void loadAdjList() {
		input = new Scanner(System.in);
		int vertices = input.nextInt();
		adjList = new LinkedList<LinkedList<Integer>>();
		for(int i = 0; i < vertices; i++) {
			LinkedList<Integer> tmp = new LinkedList<Integer>();
			int vertice = input.nextInt();
			tmp.add(vertice);
			int numNeighbors = input.nextInt();
			for(int j = 0; j < numNeighbors; j++) {
				tmp.add(input.nextInt());
			}
			adjList.add(tmp);
		}
	}
	public void shortPath(int s) {
		boolean visited[] = new boolean[adjList.size()+1];
		int[] distances = new int[adjList.size()+1];
		int distance = 0;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[s] = true;
		queue.add(s);
		distances[s] = distance;
		
		while(queue.size() != 0) {
			s = queue.poll();
			Iterator<Integer> i = adjList.get(s-1).listIterator();
			while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    distances[n] = distances[s] + 1;
                    queue.add(n); 
                } 
            } 
		}
		for(int i = 1; i < distances.length; i++) {
			if(visited[i] == false) {
				System.out.println((i)+ " " + "-1");
			}else {
				System.out.println((i) + " " + distances[i]);
			}
		}
	}
	public static void main(String[] args) {
		Main test = new Main();
		test.loadAdjList();
		test.shortPath(1);
		
	}
}

