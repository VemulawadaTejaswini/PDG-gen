import java.util.Scanner;
public class Main {
    static int[][] cost;
    static int[] row, col;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	row = new int[n];
	col = new int[n];
	String[] input;
	for (int i = 0; i < n; i++) {
	    input = scan.nextLine().split(" ");
	    row[i] = Integer.parseInt(input[0]);
	    col[i] = Integer.parseInt(input[1]);
	}
	cost = new int[n][n];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		if (i != j) {
		    cost[i][j] = Integer.MAX_VALUE;
		}
	    }
	}
	minCost(0, n-1);
	System.out.println(cost[0][n-1]);
    }
    
    static void minCost (int first, int last) {
	for (int k = first; k < last; k++) {
	    int m1 = cost[first][k], m2 = cost[k+1][last];
	    if (cost[first][k] == Integer.MAX_VALUE) {
		 minCost(first, k);
	    }
	    if (cost[k+1][last] == Integer.MAX_VALUE) {
		minCost(k+1, last);
	    }
	    int min = cost[first][k] + cost[k+1][last] + row[first] * col[k] * col[last];
	    if (cost[first][last] > min) {
		cost[first][last] = min;
	    }
	}
    }
}