import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n==0) break;

	    int[] dp = new int[n + 1];
	    dp[0] = 1;
	    for(int i=0; i<n; i++){
		for(int j=1; j<=3; j++){
		    if(i+j<=n) dp[i+j] += dp[i];
		}
	    }
	    int day = dp[n]/10 + ((dp[n]%10==0) ? 0 : 1);
	    System.out.println(day/365 + ((day%365==0) ? 0 : 1));
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}