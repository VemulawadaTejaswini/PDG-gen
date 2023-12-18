import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int b = in.nextInt();
		BigInteger bi = new BigInteger(n);
		String x = bi.toString(b);
		System.out.println(x.length());
	}
}