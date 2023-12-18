import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			char[] aa = sc.next().toCharArray();
			if (aa[0] == '0') {
				break;
			}
			char[] bb = sc.next().toCharArray();
			char[] cc = sc.next().toCharArray();
			int n = aa.length;
			long[][] dp = new long[n+1][2];
			dp[0][0] = 1;
			for(int i=1;i<=n;i++) {
				int da = aa[n-i] == '?' ? -1 : aa[n-i] - '0';
				int db = bb[n-i] == '?' ? -1 : bb[n-i] - '0';
				int dc = cc[n-i] == '?' ? -1 : cc[n-i] - '0';
				for(int j=0;j<2;j++) {
					for(int carry=0;carry<2;carry++) {
						int patterns = 0;
						for(int a=0;a<10;a++) {
							if (da != -1 && da != a) {
								continue;
							}
							for(int b=0;b<10;b++) {
								if (db != -1 && db != b) {
									continue;
								}
								int c = a + b + carry;
								if ((j == 0 && c >= 10) || (j == 1 && c < 10)) {
									continue;
								}
								if (i == n) {
									if (a * b * c == 0) {
										continue;
									}
								}
								if (dc == -1 || dc == c%10) {
									patterns++;
								}
							}
						}
						dp[i][j] += dp[i-1][carry] * patterns % MOD;
						dp[i][j] %= MOD;
					}
				}
			}
			//System.out.println(Arrays.deepToString(dp));
			System.out.println(dp[n][0]);
		}
	}

}