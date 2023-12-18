import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		boolean isMinus = false;
		if (x < 0) {
		    isMinus = true;
		    x = -x;
		}
		if (x / d > k) {
		    System.out.println(x - d * k);
		    return;
		}
		long mod = x % d;
		long div = x / d;
		k -= div;
		if (k % 2 == 0) {
		    System.out.println(mod);
		} else {
		    System.out.println(Math.abs(mod - d));
		}
	}
}
