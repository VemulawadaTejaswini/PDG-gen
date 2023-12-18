
import java.util.Scanner;

public class Main {

	static int[] sq={1,4,9,16,25,36,49,64,81,100,121,144,169,14*14,15*15,16*16,17*17};
	static boolean[][] dp;
	static int n,ans;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n = cin.nextInt();
			if(n==0)break;
			ans=0;
			dp=new boolean[301][sq.length];
			for(int i = 0;i<301;i++){
				for(int j = 0;j<sq.length;j++){
					dp[i][j]=false;
				}
			}
			dp[0][0]=dfs(0,0);
			System.out.println(ans);
		}

	}
	static boolean dfs(int sum,int depth){
		if(depth==sq.length)return false;
		if(dp[sum][depth]){ans++;return true;}
		if(sum==n){
			dp[sum][depth]=true;
			ans++;return true;
		}
		
		for(;sum<=n;){
			dp[sum][depth]=dfs(sum,depth+1);
			sum+=sq[depth];
		}
		return false;
	}
}