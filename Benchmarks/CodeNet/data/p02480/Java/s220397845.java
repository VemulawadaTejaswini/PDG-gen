import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.math.BigInteger.*;

class AOJ10001 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(x * x * x);
	}
}
public class Main {
	public static void main(String... args) {
		new AOJ10001().run();
	}
	static void debug(Object...os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}