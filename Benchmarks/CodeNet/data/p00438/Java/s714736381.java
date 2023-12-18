import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int w,h;
	static int[][] field,dp;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		w=cin.nextInt();
		h=cin.nextInt();
		field=new int[w+1][h+1];
		dp=new int[w+1][h+1];
		for(int i=0;i<w+1;i++){
			Arrays.fill(field[i],1);
			Arrays.fill(dp[i],0);
		}
		for(int i=0;i<w+1;i++){
			dp[i][1]=1;
		}
		for(int i=0;i<h+1;i++){
			dp[1][i]=1;
		}
		int n=cin.nextInt();
		for(int i=0;i<n;i++){
			int a=cin.nextInt();
			int b=cin.nextInt();
			field[a][b]=0;
			dp[a][b]=0;
		}

		for(int i=1;i<w+1;i++){
			for(int j=1;j<h+1;j++){
				if(field[i][j]==0)continue;
				if(i+j==2)continue;
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		System.out.println(dp[w][h]);
	}

}