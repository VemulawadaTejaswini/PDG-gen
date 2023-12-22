import java.math.BigInteger;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		long N = sc.nextLong();
		
		BigInteger K = BigInteger.valueOf(N);
		BigInteger b = BigInteger.ZERO;
		for (char c: S.toCharArray()) {
			if (c == '1') {
				b = b.add(BigInteger.ONE);
			} else {
				long val = Long.valueOf(String.valueOf(c));
				BigInteger tmp = BigInteger.valueOf(val).pow(100_000_0);
				BigInteger tmp2 = BigInteger.valueOf(val).pow(10);
				b = b.add(tmp.multiply(tmp).multiply(BigInteger.valueOf(5L).multiply(tmp2)));
			}
			
			if (b.compareTo(K) >= 0) {
				System.out.println(c);
				return;
			}
		}
		
	}
	
}