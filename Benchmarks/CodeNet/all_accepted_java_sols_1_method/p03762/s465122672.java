import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long mod = (long)1e9+7;
		long[] x = new long[n];
		for (int i = 0; i < n; i++) x[i] = sc.nextLong();
		long[] y = new long[m];
		for (int i = 0; i < m; i++) y[i] = sc.nextLong();
		long ans = 0;
		for (int i = 0; i < n-1; i++) {
			ans += ((x[i+1]-x[i])*(i+1)*(n-i-1))%mod;
			ans %= mod;
		}
		long ans2 = 0;
		for (int i = 0; i < m-1; i++) {
			ans2 += ((y[i+1]-y[i])*(i+1)*(m-i-1))%mod;
			ans2 %= mod;
		}
		System.out.println((ans*ans2)%mod);
		sc.close();
	}
}