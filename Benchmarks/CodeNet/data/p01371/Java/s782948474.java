import java.util.*;

class Main{

    boolean debug=false;
    int INF=1<<28;
    int N;
    int[][] t;
    int[] dp;

    void solve(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    N=sc.nextInt();
	    if(N==0)break;

	    t=new int[N][N+1];
	    for(int i=0;i<N;i++){
		for(int j=0;j<N+1;j++){
		    t[i][j]=sc.nextInt();
		}}

	    dp=new int[(1<<N)];
	    Arrays.fill(dp,INF);
	    dp[0]=0;

	    for(int S=0;S<(1<<N);S++){
		for(int i=0;i<N;i++){
		    if(((S>>i)&1)==0){
		    int mintime=t[i][0];
		    for(int j=0;j<N;j++){
			if(((S>>j)&1)==1){
			    mintime=Math.min(mintime,t[i][j+1]);
			}
		    }
		    dp[S+(1<<i)]=Math.min(dp[S+(1<<i)],dp[S]+mintime);
		    }
		}
	    }

	    System.out.println(dp[(1<<N)-1]);
	}
    }
    public static void main(String[] args){
	new Main().solve();
    }
}