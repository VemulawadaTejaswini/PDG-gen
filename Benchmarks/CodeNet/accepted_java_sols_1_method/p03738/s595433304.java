import java.util.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		int x = a.compareTo(b);
		if (x > 0) {
			System.out.println("GREATER");
		} else if (x < 0) {
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
	}
}
