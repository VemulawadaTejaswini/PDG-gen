import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// int nnn=3*(3+1)*(3+2)/6;
		// System.out.println(nnn);
		long[] dp = new long[1000001];
		long[] dpki = new long[1000001];
		int min = 1000000;
		// int tate = n * (n + 1) * (n + 2);

		// tate++;
//		long[][] dp = new long[181][n+ 1];

		for (int i = 1; i <= 1000000; i++) {
			dp[i] = i;
//			dp[0][i] = 1000000;

			dpki[i] = i;
			//dpki[0][i] = 1000000;
		}

		for (int i = 2; i < 181; i++) {

		//	for (int j = 1; j <= n; j++)
		//		dp[i][j] = dp[i - 1][j];

			int sum = i * (i + 1) * (i + 2) / 6;

			for(int j=sum;j<=1000000;j++){
				dp[j]=Math.min(dp[j],dp[j-sum]+1);
			}
			
			/*
			if (sum <= n && dp[i - 1][sum] > 1)
				dp[i][sum] = 1;
			int count = 2;
			for (int j = sum * 2; j <= n; j += sum) {
				if (dp[i - 1][j] > count)
					dp[i][j] = count;
				count++;
			}

			// for (int k = 2; n / sum >= k; k++) {
			for (int j = 1; j <= n; j++) {
				if (n >= j + sum && dp[i - 1][j + sum] > dp[i - 1][j] + 1 && dp[i][j + sum] > dp[i - 1][j] + 1)
					dp[i][j + sum] = dp[i - 1][j] + 1;
			}
			// }
			*/

		}

		for (int i = 2; i < 181; i++) {
			//for (int j = 1; j <= n; j++)
			//	dpki[i][j] = dpki[i - 1][j];

			int sum2 = i * (i + 1) * (i + 2) / 6;

			if (sum2 % 2 == 0)
				continue;

//			if(dpki[i][sum2]>1)dp[i][sum2]=1;
			for(int j=sum2;j<=1000000;j++){
				dpki[j]=Math.min(dpki[j],dpki[j-sum2]+1);
			}
			
/*				if (sum2 <= n && dpki[i - 1][sum2] > 1)dpki[i][sum2] = 1;
			int count2 = 2;
			for (int j = sum2 * 2; j <= n; j += sum2) {
				if (dpki[i - 1][j] > count2)
					dpki[i][j] = count2;
				count2++;
			}

			for (int j = 1; j <= n; j++) {
				if (n >= j + sum2 && dpki[i][j + sum2] > dpki[i][j] + 1)dpki[i][j + sum2] = dpki[i][j] + 1;
			
			}

			
			for (int k = 1; n / sum2 >= k; k++) {
				int sss=sum2*k;
				for (int j = 1; j <= n; j++) {
					if (n >= j + sss && dpki[i][j + sss] > dpki[i][j] + 1)dpki[i][j + sss] = dpki[i][j] + 1;
				
				}
			 }
			 */
			
			
		}
/*		for (int i = 0; i < 181; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(dpki[i][j] + " ");
			}
			System.out.println();
		}
*/
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

	
			long result = dp[n];
			long result2 = dpki[n];
	/*		for (int i = 0; i < 181; i++) {
				// System.out.println(dp[i][n]);
				if (dp[i][n] == 0)
					continue;
				result = (int) Math.min(dp[i][n], result);

			}
			
			for (int i = 0; i < 181; i++) {
				// System.out.println(dp[i][n]);
				if (dpki[i][n] == 0)
					continue;
				result2 = (int) Math.min(dpki[i][n], result2);

			}
*/
			System.out.print(result+" ");
			System.out.println(result2);

		}
	}
}