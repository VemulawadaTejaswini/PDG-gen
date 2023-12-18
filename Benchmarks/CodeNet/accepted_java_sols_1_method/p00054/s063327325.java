import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0054
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
			String c = new Double((double)a / b).toString();
			int[] f = new int[200];
			int idx = c.indexOf(".");
			f[0] = new Integer(c.substring(idx - 1, idx));
			for (int i = 1; i < min(200, c.substring(idx + 1).length() + 1); i++) {
				f[i] = new Integer(c.substring(idx + i, idx + i + 1));
			}

			int res = 0;
			for (int i = 1; i <= n; i++)
				res += f[i];
			System.out.println(res);
		}
	}	
}