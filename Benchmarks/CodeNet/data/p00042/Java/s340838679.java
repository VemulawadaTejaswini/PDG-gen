import java.util.Scanner;
public class Main {
    static int[] treasureV, treasureW;
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int cnt = 1;
	String[] input;
	while (true) {
	    int capacity = Integer.parseInt(scan.nextLine());
	    if (capacity == 0) {
		break;
	    }
	    int n = Integer.parseInt(scan.nextLine());
	    treasureV = new int[n];
	    treasureW = new int[n];
	    for (int i = 0; i < n; i++) {
		input = scan.nextLine().split(",");
		treasureV[i] = Integer.parseInt(input[0]);
		treasureW[i] = Integer.parseInt(input[1]);
	    }
	    System.out.println("Case " + cnt++ + ":");
	    solve(n, capacity);
	} 
    }
    
    public static void solve (int n, int w) {
	int[][] dp = new int[n+1][w+1];
	int maxvalue = Integer.MIN_VALUE;
	int minweight = Integer.MAX_VALUE;
	for (int i = n - 1; i >= 0; i--) {
	    for (int j = 0; j <=w; j++) {
		if (j < treasureW[i]) {
		    dp[i][j] = dp[i+1][j];
		} else {
		    dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-treasureW[i]] + treasureV[i]);
		    if (maxvalue < dp[i][j]) {
			maxvalue = dp[i][j];
			minweight = j;
		    } else if (maxvalue == dp[i][j] && minweight > j){
			minweight = j;
		    }
		}
	    }
	}
	System.out.println(maxvalue);
	System.out.println(minweight);
    }
}