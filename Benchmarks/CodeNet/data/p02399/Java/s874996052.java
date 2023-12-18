import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		long d = a / b;
		
		BigInteger aBI = new BigInteger(String.valueOf(a));
		BigInteger bBI = new BigInteger(String.valueOf(b));
		long r = aBI.mod(bBI).longValue();
		
		float f = a / Float.valueOf(b);
		
		System.out.println(String.format("%d %d %f", d, r, f));
	}
}