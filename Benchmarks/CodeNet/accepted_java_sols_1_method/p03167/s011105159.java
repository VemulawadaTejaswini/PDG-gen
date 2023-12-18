import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	sc.nextLine();

    	char[][] grid = new char[h][w];
    	for(int i = 0; i < h; i++) {
    		String tmp = sc.nextLine();
    		for(int j = 0; j < w; j++) {
    			grid[i][j] = tmp.charAt(j);
    		}
    	}
    	// System.out.println(Arrays.deepToString(grid));

    	int[] imove = {0, -1};
    	int[] jmove = {-1, 0};

    	int MOD = 1_000_000_007;
    	int[][] dp = new int[h][w];
    	dp[0][0] = 1;
    	for(int i = 0; i < h; i++) {
    		for(int j = 0; j < w; j++) {
    			if(grid[i][j] == '#')
    				continue;
    			for(int k = 0; k < 2; k++) {
    				int new_i = i + imove[k];
    				int new_j = j + jmove[k];
    				if(new_i >= 0 && new_j >= 0 && new_i < h && new_j < w) {
    					dp[i][j] += dp[new_i][new_j] % MOD;
    				}
    			}
    			dp[i][j] %= MOD;
    		}
    	}
    	// System.out.println(Arrays.deepToString(dp));

    	System.out.println(dp[h-1][w-1]);
    }
}