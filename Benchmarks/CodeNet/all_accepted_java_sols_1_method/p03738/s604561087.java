import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		BigInteger A = new BigInteger(String.valueOf(sc.next()));
		BigInteger B = new BigInteger(String.valueOf(sc.next()));
		
		if (A.compareTo(B) == 0) {
			System.out.println("EQUAL");
		} else if (A.compareTo(B) > 0) {
			System.out.println("GREATER");
		} else {
			System.out.println("LESS");
		}
		
		sc.close();
	}
}
