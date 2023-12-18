import java.util.Scanner;

//Sum of Integers II
public class Main{

	long[][][] dp;
	
	long get(int rest, int x, int s){
		if(rest==0 && s==0)return 1;
		if(rest<0 || x<0 || s<0)return 0;
		if(dp[rest][x][s]!=-1)return dp[rest][x][s];
		long res = 0;
		for(int nx=x;nx>=0;nx--)res+=get(rest-1, nx-1, s-nx);
		return dp[rest][x][s] = res;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), S = sc.nextInt();
			if((n|S)==0)break;
			dp = new long[n+1][101][S+1];
			for(int i=0;i<=n;i++)for(int j=0;j<=100;j++)for(int k=0;k<=S;k++)dp[i][j][k]=-1;
			System.out.println(get(n, 100, S));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}