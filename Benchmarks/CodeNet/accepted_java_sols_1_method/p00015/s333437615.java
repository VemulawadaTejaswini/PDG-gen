

import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i;
		for (i = 0; i < n; i++) {

			BigDecimal bigDecimal1 = scanner.nextBigDecimal();
			BigDecimal bigDecimal2 = scanner.nextBigDecimal();
			BigDecimal add = bigDecimal1.add(bigDecimal2);
			if (add.precision() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(add);
			}
		}
		scanner.close();
	}

}

