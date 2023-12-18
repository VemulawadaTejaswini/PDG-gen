import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[][] graph = new int[n+1][n+1];
	int[] index = new int[n+1];
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
	DFS dfs = new DFS(n, graph);
	dfs.dfs(1);
	dfs.printResult();
    }
}
class DFS {
    int n;
    int[][] graph;
    int[] d;
    int[] f;
    int timestamp;
    DFS (int n, int[][] graph) {
	this.n = n;
	this.graph = graph;
	d = new int[n+1];
	f = new int[n+1];
	timestamp = 1;
    }
    void dfs (int id) {
	if (d[id] > 0) {
	    return;
	}
	d[id] = timestamp++;
	for (int next = 1; next <=n; next++) {
	    if (graph[id][next] == 1) {
		dfs(next);
	    }
	}
	f[id] = timestamp++;
    }
    void printResult () {
	StringBuilder sb = new StringBuilder();
	for (int i = 1; i < n+1; i++) {
	    sb.append(i + " " + d[i] + " " + f[i] + "\n");
	}
	System.out.print(sb);
    }
}