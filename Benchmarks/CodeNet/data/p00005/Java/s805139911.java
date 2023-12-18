import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, GCD, LCM, a_base, b_base;
		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			a_base = a;
			b_base = b;
			int i = 0;
			if (a < b) {
				int sub;
				sub = b;
				a = b;
				b = sub;
			}
			GCD = gcd(a, b);
			LCM = (a_base * b_base) / GCD;
			System.out.println(GCD + " " + LCM);
		}
	}
	static int gcd(int a, int b) {
		if (a % b == 0)
			return b;
		return gcd(b, a % b);
	}
}