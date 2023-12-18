import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int max = sc.nextInt();
    	int[] w = new int[n];
    	int[] v = new int[n];
    	for(int i = 0; i < n; i++) {
    		w[i] = sc.nextInt();
    		v[i] = sc.nextInt();
    	}

    	int sum = 0;
    	for(int i : v)
    		sum += i;

    	long[] dp = new long[sum+1];
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	dp[0] = 0;
    	for(int i = 0; i < n; i++) {
    		for(int j = sum; j >= v[i]; j--) {
    			dp[j] = Math.min(dp[j], dp[j-v[i]] + w[i]);
    		}
    	}

    	int ans = 0;
    	for(int i = sum; i > 0; i--) {
    		if(dp[i] > 0 && dp[i] <= max) {
    			// System.out.println("ans");
    			ans = i;
    			break;
    		}
    	}

    	// System.out.println(Arrays.toString(dp));
    	System.out.println(ans);
    }
}