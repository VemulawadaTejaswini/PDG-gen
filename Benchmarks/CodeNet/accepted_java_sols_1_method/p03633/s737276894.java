
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger[] T = new BigInteger[N];
		for(int i = 0; i < N; i++) {
			T[i] = BigInteger.valueOf(scan.nextLong());
		}
		// 最大公約数を求めてそこから最小公倍数を求める
		BigInteger gcd = new BigInteger("1");		// 最大公約数
		BigInteger lcm = T[0];		// 最小公倍数
		
		for(int i = 1; i < N; i++) {
			gcd = lcm.gcd(T[i]);
			lcm = lcm.divide(gcd).multiply(T[i]);
		}
		System.out.println(lcm);
		scan.close();
	}

}
