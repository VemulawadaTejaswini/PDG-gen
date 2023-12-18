import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int dp[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE>>2 );
		}
		Arrays.fill(dp[0], 0);
		for (int i = 1; i < n; i++) {
			for (int j = 0; i + j < n; j++) {
				for (int k = 0; k < i; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[k][j] + dp[i-k-1][j+k+1] + a[j]*b[j+k]*a[j+k+1]*b[j+i]);
//					System.out.println(j +","+ (j+k)+","+(j+k+1)+","+(j+1));			
				}
			}
			System.out.println(Arrays.toString(dp[i]));
		}
		
		System.out.println(dp[n-1][0]);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}