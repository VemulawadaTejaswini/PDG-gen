import java.util.*;

class Main{
    int n,a,b;
    int[] dp;
    int Max = 1000001;

    void solve(){
	Scanner sc = new Scanner(System.in);
	while(true){
	    n = sc.nextInt();
	    a = sc.nextInt();
	    b = sc.nextInt();
	    if(n==0 && a==0 && b==0) break;

	    dp = new int[Max];
	    for(int i=1; i<=n; i++){
		if(i%a==0)dp[i] = 1;
	    }
	    dp[b] = 1;
	    for(int i=1; i+b<=n; i++){
		if(dp[i]==1)dp[i+b] = 1;
	    }

	    int unableCount = 0;
	    for(int i=1; i<=n; i++){
		if(dp[i]==0)unableCount++;
	    }

	    System.out.println(unableCount);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}