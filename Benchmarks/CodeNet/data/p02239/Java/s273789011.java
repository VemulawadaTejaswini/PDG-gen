import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    
	// returns array of distances from first vertex to each other vertex
	static int[] bfs(int[][] v, int totalVertex) {
		
		// implement queue with linked list
    	Queue<Integer> Q = new LinkedList<Integer>();
    	int[] dist = new int[totalVertex];
    	
    	// starting from index 1
    	Q.add(1);
    	dist[1] = 0;
    	
    	while(!Q.isEmpty()) {
    		int cur = Q.remove();
    		for(int i = 2; i < totalVertex; i++) {
    			// if a distance has not been set yet and current vertex and ith vertex connect
    			if(dist[i] == 0 && v[cur][i] == 1) {
    				dist[i] = dist[cur] + 1;
    				// only add into queue if a new node distance is updated
    				Q.add(i);
    			}
    		}
    	}
    	return dist;
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalVertex=in.nextInt() + 1; // arrays will have +1 offset
        
        // stores graph as 2D array
        // I know we've been using adjList but I can manipulate and visualize this so much better :/
        int[][] v=new int [totalVertex][totalVertex];
        
        for(int i = 1; i < totalVertex; i++) {
        	int vertex = in.nextInt();
        	int neighbors = in.nextInt();
        	// if vertex connects to neighbor, sets [vertex][neighbor] to 1, else will be 0
        	for(int j = 0; j < neighbors; j++) {
        		int connect = in.nextInt();
        		v[vertex][connect] = 1;
        	}
        }
        in.close();
        
        // easy enough fix to allow bfs to start from any index if necessary
        
        // create distance array
        int bfsdist[] = bfs(v, totalVertex);
        
        for(int i = 1; i < totalVertex; i++) {
        	// if no path from start to vertex
        	if(i != 1 && bfsdist[i] == 0) {
        		System.out.println(i + " -1");
        	}
        	else System.out.println(i + " " + bfsdist[i]);
        }      
	}
}
