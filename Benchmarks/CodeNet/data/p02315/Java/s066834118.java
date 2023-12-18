
import java.util.*;

public class Main {
	
	static int Data[][];
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),W=in.nextInt();
		Data=new int[N][2];
		
		for(int i=0;i<N;i++) {
			Data[i][0]=in.nextInt();
			Data[i][1]=in.nextInt();
		}		
		System.out.println(DP2Controll(W));
	}
	
	static int DP1(int limit) {
		int dp[][]=new int[Data.length+1][limit+1];
		
		for(int i=1;i<=Data.length;i++) {
			for(int j=0;j<=limit;j++) {
				if(j-Data[i-1][1]<0)dp[i][j]=dp[i-1][j];
				else dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-Data[i-1][1]]+Data[i-1][0]);
			}
		}
		
		int max=0;
		for(int i=0;i<=limit;i++)max=Math.max(max, dp[Data.length][i]);

		return max;
	}
	 
	static int dp2[][];
	static boolean done[][];
	
	static int DP2Controll(int limit) {
		dp2=new int[Data.length+1][limit+1];
		done=new boolean[Data.length+1][limit+1];
		
		int res=DP2(0,limit);
		return res;
	}
	
	static int DP2(int i,int j) {
		if(done[i][j])return dp2[i][j];

		int res;
		
		if(i==Data.length)res=0;
		else if(j<Data[i][1]) res=DP2(i+1,j);
		else {
			res=Math.max(DP2(i+1,j), DP2(i+1,j-Data[i][1])+Data[i][0]);
		}

		done[i][j]=true;
		dp2[i][j]=res;
		
		return dp2[i][j];
	}

}

