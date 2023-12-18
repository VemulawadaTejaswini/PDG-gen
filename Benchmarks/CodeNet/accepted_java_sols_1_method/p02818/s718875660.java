import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();

		long aa = a;
		long bb = b;
		long kk = k;

		aa = Math.max(a-k,0);

		if ( a < k ) {
			bb = Math.max(b-(k-a),0);
		}

		// 出力
		System.out.println(aa + " " + bb);
	}
}
