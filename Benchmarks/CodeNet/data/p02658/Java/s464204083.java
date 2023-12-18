import java.math.BigInteger;
import java.util.*;
public class da {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger a = new BigInteger("1");
		BigInteger hh = new BigInteger("1");
		for(int i = 1;i <= n;i++) {
			a = sc.nextBigInteger();
			hh = hh.multiply(a);
		}
		BigInteger yy = new BigInteger("1000000000000000000");
		if(hh.compareTo(yy) > 0)
			System.out.println("-1");
		else System.out.println(hh);

	}

}