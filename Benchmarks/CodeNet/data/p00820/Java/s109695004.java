import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		new Main().solve();
	}

	void solve(){

		Scanner cin = new Scanner(System.in);
		int MAX = 1 << 15;
		MAX += 1;
		int[][] dp = new int[MAX][5];
		dp[0][0] = 1;
		for(int i=1;i*i<=MAX;i++){
			int a = i * i;
			for(int j=0;j+a<MAX;j++){
				for(int k=0;k<4;k++){
					dp[j+a][k+1] += dp[j][k];
				}
			}
		}

		while(true)
		{
			int n = cin.nextInt();
			if(n==0) return;
			int ret = 0;
			for(int i=0;i<5;i++) ret += dp[n][i];
			System.out.println(ret);
		}
	}
}