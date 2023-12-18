
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	long gcd(long a, long b) {
		
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		return a;
	}

	void run() {
		for (; sc.hasNextLine();) {
			long p = sc.nextInt();
			long q = sc.nextInt();
			long u = gcd(p, q);
			p /= u;
			q /= u;
			int zeroLength = 0;
			p %= q;
			long prefix = p / q;

			while (q % 10 == 0) {
				q /= 10;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			while (q % 2 == 0) {
				q /= 2;
				p *= 5;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			while (q % 5 == 0) {
				q /= 5;
				p *= 2;
				prefix *= 10;
				prefix += p / q;
				p %= q;
				zeroLength++;
			}
			prefix += p / q;
//			System.out.println(p + " " + q);
			if (q == 1) {
				System.out.printf("%0" + zeroLength + "d\n", prefix);
				continue;
			}
			p %= q;
			int length = 1;
			long nine = 9;
			for (; nine % q != 0;) {
				nine = nine * 10 + 9;
				length++;
			}
			long circ = p * nine / q;
			if (zeroLength != 0) {
				System.out.printf("%0" + zeroLength + "d", prefix);
			}
			System.out.printf("%0" + length + "d\n", circ);
			for (int z = zeroLength; z-- > 0;)
				System.out.print(' ');
			for (; length-- > 0;)
				System.out.print('^');
			System.out.println();
			/*
			 * 2/12 -> 10/6 -> 1 4/6 -> 1 20/3 -> 16 6666 1/6 -> 5/3 \1 2/3
			 * 0.16666
			 */
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}