import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, c;
		boolean flag;

		while (sc.hasNext()) {
			flag = true;
			String s = sc.nextLine();
			for (int i = 9; 0 <= i; i--) {
				a = new BigInteger("0");
				b = new BigInteger("0");
				c = new BigInteger("0");
				String s2 = s;
				s2 = s2.replace('X', (char)(i + '0'));
				for (int j = 0; j < s2.length(); j++) {
					a = a.multiply(BigInteger.TEN);
					a = a.add(new BigInteger(Integer.toString(s2.charAt(j) - '0')));
					if (s2.charAt(j + 1) == '+') {
						for (int k = j + 2; k < s2.length(); k++) {
							b = b.multiply(BigInteger.TEN);
							b = b.add(new BigInteger(Integer.toString(s2.charAt(k) - '0')));
							if (s2.charAt(k + 1) == '=') {
								for (int l = k + 2; l < s2.length(); l++) {
									c = c.multiply(BigInteger.TEN);
									c = c.add(new BigInteger(Integer.toString(s2.charAt(l) - '0')));
								}
								break;
							}
						}
						break;
					}
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
}