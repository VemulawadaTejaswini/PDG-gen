import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		BigDecimal tax08 = BigDecimal.valueOf(0.08);
		BigDecimal tax10 = BigDecimal.valueOf(0.10);
		BigDecimal taxA = new BigDecimal(0);
		BigDecimal taxB = new BigDecimal(0);

		int result = -1;
		for(int i = 1; i < 10000; i++) {
			taxA = BigDecimal.valueOf(i);
			taxB = BigDecimal.valueOf(i);
			taxA = taxA.multiply(tax08);
			taxB = taxB.multiply(tax10);

			taxA = taxA.setScale(0, BigDecimal.ROUND_DOWN);
			taxB = taxB.setScale(0, BigDecimal.ROUND_DOWN);

			if(BigDecimal.valueOf(A).equals(taxA)
				&& BigDecimal.valueOf(B).equals(taxB)) {
				result = i;
				break;
			}
		}

		System.out.println(result);

	}

}
