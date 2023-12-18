import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger n = new BigInteger(sc.next());
		sc.close();

		StringBuilder result = new StringBuilder();
		BigInteger base = new BigInteger("26");
		while (n.compareTo(base) > 0) {
			int tmp = n.mod(base).intValue();
			if (tmp == 0) {
				tmp = 26;
			}
			result.append(toAlpha(tmp));
			n = n.divide(base);
		}
		result.append(toAlpha(n.intValue())).reverse();
		System.out.println(result.toString());
	}

	static String toAlpha(int n) {
		return String.valueOf((char) (n + 96));
	}
}
