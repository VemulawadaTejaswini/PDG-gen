import java.util.Scanner;

public class Main {

	static int n,s,ans;
		static int[][] dp;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			n=cin.nextInt();
			s=cin.nextInt();
			ans=0;
			dp=new int[1<<10][s+1];
			for(int i=0;i<10;i++){
				if(i>s)continue;
				dp(1<<i,i);
			}
			System.out.println(ans);
		}
	}
	static void dp(int used,int sum){
		if(dp[used][sum]!=0)return;
		if(Integer.bitCount(used)==n){
			if(sum==s)ans++;
			return;
		}
		dp[used][sum]=1;
		for(int i=0;i<10;i++){
			if(((1<<i)&used)==0){
				int step=Integer.bitCount(used)+1;
				if(sum+i*step>s)continue;
				used|=1<<i;
				dp(used,sum+i*(step));
				used^=(1<<i);
				
			}
		}
	}
}