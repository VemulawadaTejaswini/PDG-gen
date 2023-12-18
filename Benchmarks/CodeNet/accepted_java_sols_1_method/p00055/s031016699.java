import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0055
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextDouble()) {
			double a = sc.nextDouble(), res = 0.0;
			res = a;
			for (int i = 2; i <= 10; i++) {
				if (i % 2 == 0) {
					a *= 2;
				} else {
					a /= 3;
				}
				res += a;
			}
			System.out.printf("%.9f", res);
			System.out.println();
		}
	}	
}