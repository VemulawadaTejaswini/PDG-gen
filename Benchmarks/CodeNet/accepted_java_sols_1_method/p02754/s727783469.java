import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger N = BigInteger.valueOf(sc.nextLong());
		BigInteger A = BigInteger.valueOf(sc.nextLong());
		BigInteger B = BigInteger.valueOf(sc.nextLong());
		BigInteger APlusB = A.add(B);
		BigInteger dev = N.divide(APlusB);
		BigInteger mul = dev.multiply(A);
		BigInteger rem = N.remainder(APlusB);
		BigInteger total = BigInteger.valueOf(0);
		
		if (rem.equals(0)) {
			total = mul;
		} else if (rem.compareTo(A) >= 1) {
			total = mul.add(A);
		} else {
			total = mul.add(rem);
		}
		
		System.out.println(total);
	}
}	