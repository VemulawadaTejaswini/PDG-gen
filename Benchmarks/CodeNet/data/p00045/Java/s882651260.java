import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner stdin = new Scanner(System.in);
		int sumMoney =0;
		int sumStock=0;
		double averageStock;


		for(int i = 0; i < 3; i++) {
			int money = stdin.nextInt();
			int stock = stdin.nextInt();

			sumMoney += money * stock;
			sumStock += stock;
		}
		averageStock = sumStock / 3;
		BigDecimal bd = new BigDecimal(averageStock);
		BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_HALF_UP);
		System.out.println(sumMoney);
		System.out.println(bd1.doubleValue());

	}

}