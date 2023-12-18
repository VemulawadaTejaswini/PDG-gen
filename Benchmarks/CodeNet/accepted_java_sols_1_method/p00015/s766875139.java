import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int inputNum = sc.nextInt();

		for (int i = 0; i < inputNum; i++) {

			while (sc.hasNext()) {
				BigInteger a = sc.nextBigInteger();
				BigInteger b = sc.nextBigInteger();
				BigInteger sum = a.add(b);
				// 80?????\?????????80????????\??????overflow ??¨??¨????????????
				if (sum.toString().length() > 80) {
					System.out.println("overflow");
				} else {
					System.out.println(sum);
				}
			}
		}

	}

}