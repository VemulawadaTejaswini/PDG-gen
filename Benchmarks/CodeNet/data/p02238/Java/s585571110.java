import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		int[][] graph = new int[limit][limit];
		for(int i = 0; i < limit; i++) {
			int index = in.nextInt();
			int neighbors = in.nextInt();
			for(int j = 0; j < neighbors; j++) {
				graph[i][in.nextInt() - 1] = 1;
			}
		}
		in.close();
		Boolean[] searched = new Boolean[limit];
		for(int i = 0; i < limit; i++) {
			searched[i] = false;
		}
		int[] time_searched = new int[limit];
		int[] done_searching = new int[limit];
		int curr_time = 0;
		for(int i = 0; i < limit; i++) {
			if(!searched[i])
			curr_time = DFS(graph, searched, time_searched, done_searching, curr_time + 1, i);
		}
		for(int i = 0; i < limit; i++) {
			System.out.print((i + 1) + " " + time_searched[i] + " " + done_searching[i]);
			System.out.println();
		}
	}
	
	public static int DFS(int[][] graph, Boolean[] searched, int[] time_searched, int[] done_searching, int curr_time, int node) {
		searched[node] = true;
		time_searched[node] = curr_time;
		for(int i = 0; i < graph.length; i++) {
			if(graph[node][i] == 1 && !searched[i]) {
				curr_time = DFS(graph, searched, time_searched, done_searching, curr_time + 1, i);
			}
		}	
		curr_time++;
		done_searching[node] = curr_time;
		return curr_time;
	}
}

