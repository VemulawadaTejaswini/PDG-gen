import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,M;
	static int[][] idol;
	static int[][] dp;
	static int ability;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;cin.hasNext();){
			String NM=cin.nextLine();
			N=Integer.parseInt(NM.substring(0,NM.indexOf(' ')));
			M=Integer.parseInt(NM.substring(NM.indexOf(' ')+1));
			idol=new int[N][4];
			
			for(int i=0;i<N;i++){
				cin.nextLine();
				String cc=cin.nextLine();
				for(int j=0;j<3;j++){
					idol[i][j]=Integer.parseInt(cc.substring(0,cc.indexOf(" ")));
					cc=cc.substring(cc.indexOf(" ")+1);
				}
				idol[i][3]=Integer.parseInt(cc);
			}
			int ans=0;
			for(int i=1;i<=3;i++){
				dp=new int[301][301];
				for(int j=0;j<301;j++){
					Arrays.fill(dp[j], -1);
				}
				ability=i;
				ans=Math.max(ans,dp(0,M));
			}
			System.out.println(ans);
		}
	}
	static int dp(int a,int b){
//		System.out.println(a+" "+b+" "+rank);
		if(b==0)return 0;
		if(a==N){
			return 0;
		}
		if(dp[a][b]>=0)return dp[a][b];
		int re=0;
		for(int i=0;idol[a][0]*i<=b;i++){
			re=Math.max(re, dp(a+1,b-idol[a][0]*i)+idol[a][ability]*i);
			                                               
		}
		return dp[a][b]=re;
	}
}