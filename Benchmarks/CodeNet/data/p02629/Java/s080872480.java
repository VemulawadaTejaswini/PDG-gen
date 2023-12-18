import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	static void function(double N) {
		if(N != 0) {
			int mod = (int) (N%26);
			if(mod == 0) {
				mod = 26;
			}

			long x = (long) (N/26);
			if(x != 1) {
				function(x);
			}
			if(mod != 0) {
				System.out.print((char)(mod+96));
			}
		}
	}

	static long chmin(long a, long b) {
		return Math.min(a, b);
	}

	static long chmax(long a, long b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		Double N = sc.nextDouble();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		function(N);
	}
}