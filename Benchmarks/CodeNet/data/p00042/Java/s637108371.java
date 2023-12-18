import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static int W,N;
	static int[][] dp;
	static int[][] a;
	static int max,minw;
	static Stack<Integer>stack;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int T=0;
		for(;;){
			T++;
			W=cin.nextInt();
			if(W==0)break;
			
			max=-(1<<30);
			minw=1<<30;
			
			stack=new Stack<Integer>();
			N=cin.nextInt();
			dp=new int[N+1][W+1];
			a=new int[N][2];
			for(int i=0;i<N;i++){
				Arrays.fill(dp[i], 1<<30);
				String[] s=cin.next().split(",");
				a[i][0]=Integer.parseInt(s[0]);
				a[i][1]=Integer.parseInt(s[1]);
			}
			
			dp(0,W);
			System.out.println("Case "+T+":");
			System.out.println(max+"\n"+(minw-1));
		}
	}
	static int dp(int t,int w){
		int re=0;
		if(t==N){
			return 0;
		}
		if(dp[t][w]!=1<<30)return dp[t][w];
		if(w-a[t][1]<0){
			re=dp(t+1,w);
		}
		else{
			re=Math.max(dp(t+1,w), dp(t+1,w-a[t][1])+a[t][0]);
			if(re>max){
				max=re;
				minw=w;
			}
			else if(re==max){
				minw=Math.min(minw, w);
			}
				
		}
		return dp[t][w]=re;
	}
}