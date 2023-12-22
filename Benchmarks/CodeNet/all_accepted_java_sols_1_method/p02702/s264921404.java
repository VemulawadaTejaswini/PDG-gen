import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int n = S.length();
		int[] ten = new int[n + 1];
		ten[0] = 1;
		for(int i = 1; i < ten.length; i++) {
			ten[i] = (ten[i - 1] * 10) % 2019;
		}
		int[] sum = new int[n + 1];
		sum[0] = 0;
		for(int i = 1; i <= n; i++) {
			sum[i] = (sum[i - 1] + Integer.parseInt(S.substring(n-i,n-i+1)) * ten[i-1]) % 2019;
		}

		int[] count = new int[2019];
		for(int i = 0; i <= n; i++) {
			int res = sum[i] % 2019;
			count[res] ++;
		}
		int ans = 0;
        for (int i = 0; i < count.length; i++) {
            ans += count[i]*(count[i]-1)/2;
        }
        System.out.println(ans);
	}
}
