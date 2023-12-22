import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] x = new int[n];
		for(int i=0; i<n; i++)x[i]=s.nextInt();

		long[][] dp = new long[n-1][21];

		dp[0][x[0]] = 1;

		for (int i=1; i < n-1; ++i) {
            for (int j=0; j <= 20; ++j) {
                if (j + x[i] <= 20) {
                    dp[i][j+x[i]] += dp[i-1][j];
                }
                if (j - x[i] >= 0) {
                    dp[i][j-x[i]] += dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n-2][x[n-1]]);

	}

}

