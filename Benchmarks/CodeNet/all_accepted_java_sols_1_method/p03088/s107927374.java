import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][][][] dp = new int[4][4][4][n];
	    for (int a = 0; a < 4; a++) {
	        for (int b = 0; b < 4; b++) {
	            for (int c = 0; c < 4; c++) {
	                if (a == 0 && b == 1 && c == 2) {
	                    continue;
	                } else if (a == 1 && b == 0 && c == 2) {
	                    continue;
	                } else if (a == 0 && b == 2 && c == 1) {
	                    continue;
	                }
	                dp[a][b][c][2] = 1;
	            }
	        }
	    }
		for (int i = 3; i < n; i++) {
		    for (int a = 0; a < 4; a++) {
		        for (int b = 0; b < 4; b++) {
		            for (int c = 0; c < 4; c++) {
    		            for (int d = 0; d < 4; d++) {
    		                if (a == 0 && c == 1 && d == 2) {
    		                    continue;
    		                } else if (a == 0 && b == 1 && d == 2) {
    		                    continue;
    		                } else if (b == 0 && c == 1 && d == 2) {
    		                    continue;
    		                } else if (b == 1 && c == 0 && d == 2) {
    		                    continue;
    		                } else if (b == 0 && c == 2 && d == 1) {
    		                    continue;
    		                }
    		                dp[b][c][d][i] += dp[a][b][c][i - 1];
    		                dp[b][c][d][i] %= MOD;
    		            }
		            }
		        }
		    }
		}
		int count = 0;
	    for (int a = 0; a < 4; a++) {
	        for (int b = 0; b < 4; b++) {
	            for (int c = 0; c < 4; c++) {
	                count += dp[a][b][c][n - 1];
	                count %= MOD;
	            }
	        }
	    }
	    System.out.println(count);
   }
}


