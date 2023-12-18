import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		long C = (long)(B * 100);
		
		BigInteger bi = BigInteger.valueOf(A*C);
		
		BigInteger ba = BigInteger.valueOf(100);
		
		System.out.println(bi.divide(ba));
	}	
}

