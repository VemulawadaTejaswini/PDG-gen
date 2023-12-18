import java.util.Scanner;
 
public class Main {
	static final long MOD = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long all = modPow(10, n);
		long comp = modPow(9, n) + modPow(9, n) - modPow(8, n);
		
		long ans = all - comp;
		ans = (ans + MOD) % MOD;
		System.out.println(ans);
		
		sc.close();
	}
	
	static long modPow(long base, long n) {
		long re = 1;
		for (int i = 0; i < n; i++) {
			re = re * base % MOD;
		}
		return re;
	}
}

