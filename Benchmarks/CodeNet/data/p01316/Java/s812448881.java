import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2199();
	}
	final int INF=1<<28;
	
	class AOJ2199{
		AOJ2199(){
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				solve();
			}
		}
		int N,M;
		void solve(){
			int[] c=new int[M];
			for(int i=0; i<M; ++i)	c[i]=sc.nextInt();
			int[] x=new int[N];
			for(int i=0; i<N; ++i)	x[i]=sc.nextInt();
			
			int[][] dp=new int[N+1][256];
			for(int i=0; i<=N; ++i)for(int j=0; j<=255; ++j)	dp[i][j]=INF;
			dp[0][128]=0;
			for(int i=1; i<=N; ++i)for(int j=0; j<=255; ++j)for(int k=0; k<M; ++k){
				int tmp=max(0, min(255, j+c[k]));
				dp[i][tmp]=min(dp[i][tmp], dp[i-1][j]+(x[i-1]-(tmp))*(x[i-1]-(tmp)));
			}
			int ans=INF;
			for(int i=0; i<=255; ++i)	ans=min(ans, dp[N][i]);
			System.out.println(ans);
		}
	}

}