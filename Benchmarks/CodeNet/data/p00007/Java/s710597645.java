import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double money = 100000;
		int num = sc.nextInt();

		for(int i = 0; i < num; i++)
			money *= 1.05;

		BigDecimal bd = new BigDecimal(money);
		BigDecimal thousand = new BigDecimal(1000);
		bd = bd.divide(thousand);
		BigDecimal result = bd.setScale(0, BigDecimal.ROUND_UP);
		result = result.multiply(thousand);
		System.out.println(result);
	}

}