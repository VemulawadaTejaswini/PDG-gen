import java.util.Scanner;

public class Main{
	static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long m = scan.nextInt();
		long n = scan.nextInt();
		scan.close();
		long ans = modPow(m, n);
		System.out.println(ans);
	}
	static long modPow(long x, long n) {
		long res = 1;
		while(n > 0) {
			if(n % 2 == 1) {
				res = res * x % MOD;
			}
			x = x * x % MOD;
			n = n / 2;
		}
		return res;
	}
}
