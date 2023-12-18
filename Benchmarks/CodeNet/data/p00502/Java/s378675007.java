import java.util.*;

class Main{

    void solve(){
	Scanner sc = new Scanner(System.in);

	int d = sc.nextInt();
	int n = sc.nextInt();
	int[] t = new int[d];
	for(int i=0; i<d; i++) t[i] = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
	int[] c = new int[n];
	for(int i=0; i<n; i++){
	    a[i] = sc.nextInt();
	    b[i] = sc.nextInt();
	    c[i] = sc.nextInt();
	}

	int INF = -1;

	int[][] dp = new int[d][n];
	for(int i=0; i<d; i++) Arrays.fill(dp[i], INF);

	for(int i=0; i<n; i++){
	    if(a[i]<=t[0] && t[0]<=b[i]) dp[0][i] = 0;
	}

	for(int i=1; i<d; i++){
	    for(int j=0; j<n; j++){
		if(!(a[j]<=t[i] && t[i]<=b[j])) continue;
		for(int k=0; k<n; k++){
		    if(dp[i-1][k]==INF) continue;
		    dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + Math.abs(c[k]-c[j]));
		}
	    }
	}

	//for(int i=0; i<d; i++) System.out.println(Arrays.toString(dp[i]));

	int ans = 0;
	for(int i=0; i<n; i++){
	    if(dp[d-1][i]!=INF && ans<dp[d-1][i]) ans = dp[d-1][i];
	}

	System.out.println(ans);
    }

    public static void main(String[] args){
	new Main().solve();
    }
}