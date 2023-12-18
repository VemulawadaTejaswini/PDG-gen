import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		BigDecimal k = BigDecimal.valueOf(sc.nextInt());
		//		int k = sc.nextInt();
		sc.close();

		//		System.out.println(Math.pow(10.0, 10000));
		BigDecimal tmp = new BigDecimal("0");
		BigDecimal pow = new BigDecimal("1");
		for (int i = 1; i <= 1000000; i++) {
			tmp = tmp.add(new BigDecimal("7").multiply(pow));
			BigDecimal result = tmp.remainder(k);
			if (result.compareTo(new BigDecimal("0")) == 0) {
				System.out.println(i);
				return;
			}
			pow = new BigDecimal("10").multiply(pow);
		}
		System.out.println(-1);
	}
}