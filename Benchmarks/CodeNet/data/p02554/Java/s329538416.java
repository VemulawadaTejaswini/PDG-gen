import java.util.Scanner;

public class Main {
	static final long DIVISOR = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		sc.close();
		
		// 結果の出力
		System.out.println(powmod(10, N) - ((powmod(9, N)) * 2 - powmod(8, N)));
	}
	
	static long powmod(long x, long y) {
		long res = 1;
		for (long i = 0; i < y; i++) {
			res = res * x % DIVISOR;
		}
		return res;
	}
}