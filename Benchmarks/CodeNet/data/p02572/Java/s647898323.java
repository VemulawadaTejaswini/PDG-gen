import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		final int mod = 1000000007;
		double hako[] = new double[n+1];
		double ans = 0;
		double a=0;

		for(int i=1;i<=n;i++) {
			a = sc.nextDouble();
			hako[i]=(hako[i-1] + a) % mod;//累積和
			ans += a*hako[i-1];
			ans %= mod;//必須
		}
		System.out.println((int)ans);
	}
}
