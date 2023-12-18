import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		int x = 0;
		BigInteger factorial = new BigInteger("1");
		int count = 0;
		try {
			sc = new Scanner(System.in);

			while ((x = sc.nextInt()) != 0) {
				for (int i = 1; i <= x; i++) {

					factorial =  factorial.multiply(new BigInteger(String.valueOf(i)));

				}
				String[] str = String.valueOf(factorial).split("");

				for (int i = str.length - 1; Integer.parseInt(str[i]) == 0; i--) {

					count++;

				}
				System.out.println(count);
				factorial = new BigInteger("1");
				count = 0;

			}

		} finally {
			sc.close();
		}

	}

}