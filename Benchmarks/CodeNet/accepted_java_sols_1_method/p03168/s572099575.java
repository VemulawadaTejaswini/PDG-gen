import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n;
		Scanner s  = new Scanner(System.in);
		n = s.nextInt();
		double [] probabilities = new double[n];
		for(int i=0;i<n;i++) {
			probabilities[i] = s.nextDouble();
		}
		double [][] dp = new double[n+1][n+1];
		//dp[i][j] = probability of getting j heads from the first i coins
		dp[0][0] = 1;
		//probability of getting 0 heads from 0 coins is 0
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) {
					dp[i][j]=dp[i-1][j]*(1-probabilities[i-1]);
				}
				else {
					dp[i][j] = dp[i-1][j]*(1-probabilities[i-1]) + dp[i-1][j-1] * probabilities[i-1];
				}
			}
		}
		double sum = 0;
		for(int i=n/2 + 1;i<n+1;i++) {
			sum+=dp[n][i];
		}
		System.out.println(sum);

	}

}
