import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();

			if ((n | m | k) == 0) {
				break;
			}

			double dp[] = new double[n * m];
			dp[0] = 1;
			for(int i = 0 ; i < n ; i++){
				double nextDP[] = new double[n*m];
				for(int j = 0 ; j < n*m;j++){
					for(int z = 1 ; z <= m ;z++){
						if(j - z >= 0){
							nextDP[j] += dp[j-z]/m;
						}
					}
				}
				dp = nextDP;
			}

			
			double v = 0;
			for (int i = 0; i <= k; i++) {
				v += (k - i + 1) * dp[i];
				
			}
			v += n * (m + 1) / 2.0;
			v -= k;
			System.out.println(v);

		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}