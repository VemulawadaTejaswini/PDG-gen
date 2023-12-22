import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		double money = 100000;
		int moneyNew = 0;
		int n = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < n; i++) {
			money = money + money * 0.05;
			BigDecimal bd = new BigDecimal(money);
			BigDecimal bd2 = bd.setScale(-3, BigDecimal.ROUND_UP);
			money = +bd2.intValue();
		}

		System.out.println((int) money);

	}

}