//Volume5-0515
import java.util.Arrays;
import java.util.Scanner;

class Main {

	private static int    [][] dp;
	private static boolean[][] flg;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a,b,n,x,y;
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0&&b==0){break;}
			a++; b++;
			dp  = new int    [b][a];
			flg = new boolean[b][a];
			dp[1][0]=1;
			for(int i=0;i<b;i++){Arrays.fill(flg[i], true);}
			n   = sc.nextInt();
			while(n-- > 0){
				x = sc.nextInt();
				y = sc.nextInt();
				flg[y][x]=false;
			}
			for(int i=1;i<b;i++){
				for(int j=1;j<a;j++){
					if(flg[i][j]){
						dp[i][j]=dp[i-1][j]+dp[i][j-1];
					}
				}
			}
			System.out.println(dp[b-1][a-1]);
		}
	}
}