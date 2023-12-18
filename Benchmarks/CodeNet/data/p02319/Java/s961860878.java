import java.util.*;

public class Main {
	static int N,W,Data[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		N=in.nextInt();W=in.nextInt();
		Data=new int[N][2];
		int V=0;
		
		for(int i=0;i<N;i++) {
			Data[i][0]=in.nextInt();
			Data[i][1]=in.nextInt();
			V+=Data[i][0];
		}
		
		int dp[][]=new int[N+1][V+1];
		for(int i=0;i<N;i++) {
			int v=Data[i][0],w=Data[i][1];
			
			for(int j=0;j<=V;j++) {
				dp[i+1][j]=Math.max(dp[i+1][j],dp[i][j]);
				if(j+v<=V) {
					dp[i+1][j+v]=Math.max(dp[i+1][j+v], dp[i][j]+w);
				}
			}
		}
		
		int i=0;
		for(i=0;i<V;i++) {
			if(dp[N][i+1]>W)break;
		}
		System.out.println(i);
	}

}

