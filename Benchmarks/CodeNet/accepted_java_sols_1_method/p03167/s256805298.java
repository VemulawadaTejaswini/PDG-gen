import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		long mod=1000000007;
		char[][] map=new char[h][w];
		for(int i=0; i<h; i++){
			map[i]=sc.next().toCharArray();
		}
		long[][] dp=new long[h+1][w+1];
		dp[1][1]=1;
		for(int i=1; i<=h; i++){
			for(int j=1; j<=w; j++){
				if(map[i-1][j-1]=='.'){
					dp[i][j]+=(dp[i-1][j]+dp[i][j-1])%mod;
				}
			}
		}
		System.out.println(dp[h][w]);
	}
}
