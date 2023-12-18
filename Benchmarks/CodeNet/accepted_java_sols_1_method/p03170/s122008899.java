import java.util.*;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    	}

    	boolean[] dp = new boolean[k+1];
    	for(int i = 0; i <= k; i++) {
    		for(int j : a) {
    			if(j <= i && !dp[i - j]) {
    				dp[i] = true;
    			}
    		}
    	}
    	// System.out.println(Arrays.toString(dp));

    	if(dp[k])
    		System.out.println("First");
    	else
    		System.out.println("Second");
    }
}