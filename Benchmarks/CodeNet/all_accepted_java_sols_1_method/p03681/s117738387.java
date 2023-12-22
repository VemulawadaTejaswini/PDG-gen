import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		if(Math.abs(N - M) > 1) {
			System.out.println(0);
			System.exit(0);
		}
		long mod = 1000000007;
		long ans = 1;
		if(N == M) ans = 2;
		for(int i = 1; i <= N; i++) {
			ans *= i;
			ans %= mod;
		}
		for(int i = 1; i <= M; i++) {
			ans *= i;
			ans %= mod;
		}
		System.out.println(ans);
	}
}