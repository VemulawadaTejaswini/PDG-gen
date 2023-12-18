import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static AL[] adjArr;
	public static boolean visited[];
	public static int d[]; // discover time
	public static int f[]; // finish time
	public static int currentTime;
	
	public static void dfs(int id){
		// update discover time of current node
		d[id] = currentTime++;
		
		int next;

		// Start checking paths from id
		for(int i = 0; i < adjArr[id].al.size(); i++){
			next = adjArr[id].al.get(i);
			// If already visited, keep checking until new node found
			if(visited[next])continue;
			visited[next] = true;
			dfs(next);
		}
		// When unvisited node found, set finish time
		f[id] = currentTime++;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner in = new  Scanner(System.in);

		int totalVertex = in.nextInt();
		adjArr = new AL[totalVertex];

		for(int i = 0; i < totalVertex; i++){
			adjArr[i] = new AL();
		}

		visited = new boolean[totalVertex];
		// Initialize visited array with false
		for(int i = 0; i < totalVertex; i++){
			visited[i] = false;
		}

		d = new int[totalVertex];
		f = new int[totalVertex];

		int id, connections, neighbor;
		currentTime = 1;

		for(int j = 0; j < totalVertex; j++){
			id = in.nextInt();
			// de-increment to get correct arr index
			id--;

			connections = in.nextInt();

			for(int i = 0; i < connections; i++){
				neighbor = in.nextInt();
				// Again, de-increment for correct index
				neighbor--;
				// Connect the neighbor
				adjArr[id].al.add(neighbor);
			}
		}

		for(int i = 0; i < totalVertex; i++){
			if(visited[i])continue;
			visited[i] = true;
			dfs(i);
		}

		for(int i = 0; i < totalVertex; i++){
			System.out.println((i+1) + " " + d[i] + " " + f[i]);
		}
		
		in.close();
	}

}

// To deal with unchecked warnings for ArrayList<Integer>
class AL{
	ArrayList<Integer> al;
	
	AL() {
		al = new ArrayList<Integer>();
	}
}

