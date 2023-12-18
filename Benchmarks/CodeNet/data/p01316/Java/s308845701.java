import java.util.*;

public class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    if(n==0 && m==0) break;
	    int[] c = new int[m];
	    int[] x = new int[n];
	    for(int i=0; i<m; i++) c[i] = sc.nextInt();
	    for(int i=0; i<n; i++) x[i] = sc.nextInt();
	    
	    int INF = 100000000;
	    int[][] dp = new int[256][n+1];
	    for(int i=0; i<256; i++) Arrays.fill(dp[i], INF);
	    dp[128][0] = 0;
	    
	    for(int i=1; i<=n; i++){
		for(int j=0; j<256; j++){
		    if(dp[j][i-1]==INF) continue;
		    for(int k=0; k<m; k++){
			int newY = j+c[k];
			if(newY<0) newY = 0;
			else if(newY>255) newY = 255;
			dp[newY][i] = Math.min(dp[newY][i], dp[j][i-1]+(newY-x[i-1])*(newY-x[i-1]));
		    }
		}
	    }
	    
	    int min = INF;
	    for(int i=0; i<256; i++) min = Math.min(min, dp[i][n]);
	    
	    System.out.println(min);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}