import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b, c, GCD, LCM, a_base, b_base;
		while (sc.hasNext()) {
			a = sc.nextLong();
			a_base = a;
			b = sc.nextLong();
			b_base = b;
			while (true) {
				if (a > b) {
					c = a % b;
					if (c == 0) {
						GCD = b;
						break;
					}
					a = b;
					b = c;
				} else if (a <= b) {
					c = b % a;
					if (c == 0) {
						GCD = a;
						break;
					}
					a = a;
					b = c;
				}
			}
			LCM =(a_base * b_base)/ GCD;
			System.out.printf("%ld %ld/n",GCD,LCM);
		}
	}
}