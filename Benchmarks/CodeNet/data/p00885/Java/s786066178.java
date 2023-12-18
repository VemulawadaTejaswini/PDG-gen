import java.util.*;

class Main{
    int INF=1<<28;
    boolean debug=true;
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int n=sc.nextInt();if(n==0)break;
	    int[] p=new int[n+1];int[] t=new int[n+1];
	    p[0]=t[0]=0;
	    for(int i=1;i<=n;i++){
		p[i]=sc.nextInt();t[i]=sc.nextInt();
	    }
	    int[][] dp=new int[n+1][4];
	    for(int i=0;i<dp.length;i++){
		for(int j=0;j<dp[0].length;j++){
		    dp[i][j]=INF;
		}}

	    dp[0][0]=0;int b=0;
	    for(int i=0;i<n;i++){
		for(int j=0;j<=3;j++){
		    if(dp[i][j]<INF)b=i;
		    if(j==3){
			if(t[i+1]>=t[i]+4*p[i]+p[i+1]){
			    dp[i+1][0]=Math.min(dp[i+1][0],dp[i][j]+p[i]+p[i+1]);
			}
		    }else{
			int dist=Math.abs(p[i]-p[i+1]);
			if(t[i+1]>=t[i]+(j+2)*dist){
			    dp[i+1][j+1]=Math.min(dp[i+1][j+1],dp[i][j]+dist);
			}
			if(t[i+1]>=t[i]+(j+2)*p[i]+p[i+1]){
			    dp[i+1][0]=Math.min(dp[i+1][0],dp[i][j]+p[i]+p[i+1]);
			}
		    }
		}
	    }

	    int ans=INF;
	    for(int i=0;i<=3;i++)ans=Math.min(ans,dp[n][i]);
	    if(ans==INF)System.out.printf("NG %d\n",b+1);
	    else System.out.printf("OK %d\n",ans+p[n]);
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}