import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	static long chmin(long a, long b) {
		return Math.min(a, b);
	}

	static long chmax(long a, long b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 入力
		String A = sc.nextLine();

	    // Scannerクラスのインスタンスをクローズ
		sc.close();
		if( Character.isUpperCase( A.charAt( 0 ) ) ) {
		    System.out.println( "A" );
		}
		else {
		    System.out.println( "a" );
		}
	}
}
