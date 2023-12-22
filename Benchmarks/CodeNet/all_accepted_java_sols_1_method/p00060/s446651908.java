import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0060
public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		while (sc.hasNextInt()) {
			int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt(), cnt = 0;
			for (int i = 1; i <= 10; i++) {
				if (c1 != i && c2 != i && c3 != i && (c1 + c2 + i) <= 20) {
					cnt++;
				}
			}
			double p = (double)cnt / 7 * 100;
			if (p - EPS > 50.0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}