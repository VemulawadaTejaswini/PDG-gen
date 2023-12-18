import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, c;
		boolean flag;
		String s;

		a = new BigInteger("0");
		b = new BigInteger("0");
		c = new BigInteger("0");
		while (sc.hasNext()) {
			s = sc.next();
			flag = true;
			for (int i = 0; i < 10; i++) {
				String s2 = s;
				s2 = s2.replace('X', (char)(i + '0'));
				int index = 0;
				a = f(s2, index);
				while (Character.isDigit(s2.charAt(index))) {
					index++;
				}
				index++;
				b = f(s2, index);
				while (Character.isDigit(s2.charAt(index))) {
					index++;
				}
				index++;
				c = f(s2, index);
				if (a == null || b == null || c == null) {
					continue;
				}
				if (a.add(b).equals(c)) {
					System.out.println(i);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("NA");
			}
		}
	}

	public static BigInteger f(String s, int i) {
		BigInteger a = new BigInteger(Integer.toString(s.charAt(i) - '0'));
		i++;
		if (a.equals(BigInteger.ZERO) && i < s.length() && Character.isDigit(s.charAt(i))) {
			return null;
		}
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			a = a.multiply(BigInteger.TEN);
			a = a.add(new BigInteger(Integer.toString(s.charAt(i) - '0')));
			i++;
		}
		return a;
	}
}