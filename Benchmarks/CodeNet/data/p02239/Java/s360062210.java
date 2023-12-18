import java.util.Scanner;
import java.util.ArrayDeque;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[][] graph = new int[n+1][n+1];
	int u, k, v;
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    u = Integer.parseInt(input[0]);
	    k = Integer.parseInt(input[1]);
	    for (int j = 0; j < k; j++) {
		v = Integer.parseInt(input[2+j]);
		graph[u][v] = 1;
	    }
	}

	ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	int[] dist = new int[n+1];
	for (int i = 2; i <=n; i++) {
	    dist[i] = Integer.MAX_VALUE;
	}
	queue.add(1);
	while (!queue.isEmpty()) {
	    int city = queue.poll();
	    for (int i = 0; i <= n; i++) {
		if (graph[city][i] != 0 && dist[i] > dist[city] + 1) {
		    dist[i] = dist[city] + 1;
		    queue.add(i);
		}
	    }
	}

	for (int i = 1; i <=n; i++) {
	    System.out.println(dist[i]);
	}
    }
}