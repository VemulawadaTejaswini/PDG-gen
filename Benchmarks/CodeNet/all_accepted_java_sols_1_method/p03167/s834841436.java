
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String a[] = new String[n];
		int dp[][] = new int[n][m];
		for (int i=0;i<n;i++) {
			a[i] = sc.next();
		}
		dp[0][0]= 1;
		for (int i=0;i<n;i++)
			for (int j=0;j<m;j++) {
				if (i==0 && j==0) continue;
				dp[i][j] = 0;
				if (i>0 && a[i-1].charAt(j)=='.') dp[i][j] =(dp[i][j] + dp[i-1][j])%1000000007;
				if (j>0 && a[i].charAt(j-1)=='.') dp[i][j] =(dp[i][j] + dp[i][j-1])%1000000007;
			}
		System.out.println(dp[n-1][m-1]);
		

	}
}
