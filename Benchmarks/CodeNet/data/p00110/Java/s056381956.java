import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0110
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String s = sc.next();
			boolean ok = false;
			for (int i = 1; i <= 9; i++) {
				char[] expr_ = s.toCharArray();
				for (int j = 0; j < expr_.length; j++) {
					if (expr_[j] == 'X') {
						expr_[j] = (char)('0' + i); 
					}
				}
				String expr = new String(expr_);
				int idx1 = expr.indexOf("+"), idx2 = expr.indexOf("=");
				BigInteger 	a = new BigInteger(expr.substring(0, idx1)),
							b = new BigInteger(expr.substring(idx1 + 1, idx2)),
							c = new BigInteger(expr.substring(idx2 + 1));
				if (a.add(b).equals(c)) {
					System.out.println(i);
					ok = true;
					break;
				}
			}
			if (!ok) System.out.println("NA");
		}
	}
}