import java.util.*;

public class Main{
	private static int[] dp = new int[1000010];
	private static int[] dp2 = new int[1000010];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ツスツタツッツクツオツーツバツーツフツδ債ーツ妥開ツ用
		for(int i=1;i<=1000000;i+=100){
			solve(i);
			solve2(i);
		}

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			System.out.println(dp[n]+" "+dp2[n]);
		}
	}

	private static int solve(int n){
		if(n == 0) return 0;
		if(dp[n] != 0) return dp[n];

		int tmp = 0, res = Integer.MAX_VALUE;
		for(int i=1;(tmp=i*(i+1)*(i+2)/6)<=n;i++){
			res = Math.min(res,solve(n-tmp));
		}

		return dp[n]=(res+1);
	}

	private static int solve2(int n){
		if(n == 0) return 0;
		if(dp2[n] != 0) return dp2[n];

		int tmp = 0, res = Integer.MAX_VALUE;
		for(int i=1;(tmp=i*(i+1)*(i+2)/6)<=n;i++){
			if(tmp % 2 == 1)
				res = Math.min(res,solve2(n-tmp));
		}

		return dp2[n]=(res+1);
	}
}