import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static int W,N;
	static int[][] dp;
	static int[][] a;
	static Stack<Integer>stack;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int T=0;
		for(;;){
			T++;
			W=cin.nextInt();
			if(W==0)break;
			stack=new Stack<Integer>();
			N=cin.nextInt();
			dp=new int[N+1][W+2];
			a=new int[N+1][2];
			for(int i=1;i<=N;i++){
//				Arrays.fill(dp[i], 1<<30);
				String[] s=cin.next().split(",");
				a[i][0]=Integer.parseInt(s[0]);
				a[i][1]=Integer.parseInt(s[1]);
			}
			
//			dp(0,0);
//			System.out.println(dp(0,0));
			int max=-(1<<30),w=(1<<30);
			for(int i=1;i<=N;i++){
				for(int j=1;j<=W+1;j++){
					if(j-a[i][1]>=0){
						dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-a[i][1]]+a[i][0]);
						if(max<dp[i][j]){
							max=dp[i][j];
							w=j;
						}
						else if(max==dp[i][j]){
							w=Math.min(w, j);
						}
					}
					else{
						dp[i][j]=dp[i-1][j];
					}
				}
			}
			System.out.println("Case "+T+":");
			System.out.println(max+"\n"+(w));
			
			if(stack.isEmpty())continue;
			
			for(int i=0;i<N;i++){
				for(int j=0;j<=W;j++){
					if(dp[i][j]==1<<30)continue;
					if(max<dp[i][j]){
						max=dp[i][j];
						w=j;
						System.out.println(j);
					}
					else if(max==dp[i][j]){
						w=Math.min(w, j);
						System.out.println(j);
					}
				}
			}
			
			System.out.println(max+" "+w);
		}
	}
	static int dp(int t,int w){
		int re=0;
		if(t==N){
			return 0;
		}
		if(dp[t][w]!=1<<30)return dp[t][w];
		re=Math.max(re, dp(t+1,w));
		
		for(int i=t;i<N;i++){
			if(a[i][0]!=0){
				int tmp=a[i][0];
				if(w+a[i][1]>W)continue;
				stack.add(i);
				re=Math.max(re,dp(t+1,w+a[i][1])+tmp);
				stack.pop();
				a[i][0]=tmp;
			}
		}
		return dp[t][w]=re;
	}
	
}