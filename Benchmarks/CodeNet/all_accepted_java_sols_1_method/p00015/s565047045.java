import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
				for (int i = 0; i < n; i++) {
					BigInteger bint1 = sc.nextBigInteger();
					BigInteger bint2 = sc.nextBigInteger();
					bint1 = bint1.add(bint2);
						if (bint1.toString().length() > 80) {
							System.out.println("overflow");
						} else {
							System.out.println(bint1);
						}
				}

	}

}
