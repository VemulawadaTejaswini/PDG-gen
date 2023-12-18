import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			BigInteger bi = scn.nextBigInteger();
			if (bi.isProbablePrime(17)) {
				System.out.println(bi);
			} else {
				System.out.println(bi.nextProbablePrime());
			}
		}
	}
}
