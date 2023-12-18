
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int mod=1000000007;
	public static void main(String[] args) {
		solve31();
	}
	
	private static void solve31() {
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextLong();

		long ans=0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				long prod= (long)(arr[i]* arr[j]);
				
				ans=ans+prod;
				ans = ans%mod;
			}
		}
		System.out.println(ans);
	}
}