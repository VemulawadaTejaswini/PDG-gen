import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

			int num = 0;
			while (sc.hasNextInt() && (num = sc.nextInt()) != 0) {
				BigInteger factorial = calc(num);

				char[] c = String.valueOf(factorial).toCharArray();
				int count = 0;
				for (int i = c.length - 1; i > 0; i--) {
					if ('0' != c[i]) {
						break;
					}
					count++;
				}

				System.out.println(count);
			}
		} finally {
			sc.close();
		}
	}

	public static BigInteger calc(int num) {
		BigInteger result = new BigInteger("1");
		BigInteger bigNum = new BigInteger(String.valueOf(num));
		for (int i = 0; i < num; i++) {
			result = result
					.multiply(bigNum.subtract(new BigInteger(String.valueOf(i))));
		}
		return result;
	}
}