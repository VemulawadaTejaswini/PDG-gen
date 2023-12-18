
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long hako[] = new long[n+1];
		double ans = 0;
		int mod = 1000000007;
		long a=0;

		for(int i=1;i<=n;i++) {
			a = sc.nextLong();
			hako[i]=hako[i-1] + a;//累積和
			ans += a*hako[i-1];
			ans %= mod;//必須
		}

		System.out.println((int)ans);
	}
}
