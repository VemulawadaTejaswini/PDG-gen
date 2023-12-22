import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {
    		int N = sc.nextInt();
    		int W = sc.nextInt();
    		//dp[重さ] = max 価値
    		long[] dp = new long[W+1];
    		int[] v = new int[N];
    		int[] w = new int[N];
    		for(int i=0; i<N; i++) {
    			v[i] = sc.nextInt();
    			w[i] = sc.nextInt();
    		}
    		for(int i=0; i<W+1; i++) {
    			dp[i] = 0;
    		}
    		for(int i=0; i<N; i++) {
    			for(int j=W; j>0; j--) {
    				if(j-w[i] >= 0)
    					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
    			}
    		}
    		System.out.println(dp[W]);

    	}
    }

}


