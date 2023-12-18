import java.util.*;

public class Main{
    static int W,n;
    static int[] w,v;
    static int[][] dp;
    static int MAX_N = 10000;
    static int MAX_W = 1000;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	W = sc.nextInt();
	int count = 1;

	while(W!=0){
	    n = sc.nextInt();
	    w = new int[n];
	    v = new int[n];
	    for(int i=0; i<n; i++){
		String[] line = sc.next().split(",");
		v[i] = Integer.parseInt(line[0]);
		w[i] = Integer.parseInt(line[1]);
	    }

	    dp = new int[n+1][W+1];

	    solve();
	    System.out.println("Case "+count+":");
	    System.out.println(dp[0][W]);
	    System.out.println(W);

	    count++;
	    W = sc.nextInt();
	}
    }

    public static void solve(){
	for(int i=n-1; i>=0; i--){
	    for(int j=0; j<=W; j++){
		if(j<w[i]){
		    dp[i][j] = dp[i+1][j];
		}else{
		    dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-w[i]]+v[i]);
		}
	    }
	}
    }

    public static int getMin(){
	int min = 1000;
	for(int j=0; j<=W; j++){
	    if(dp[0][j]==dp[0][W] && j<min){
		min = j;
	    }
	}
	return min;
    }
}