import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();

		long bunsi = L * L * L;
		double ans = bunsi / 27.0;

		BigDecimal bd = new BigDecimal(ans);
		System.out.println(bd.setScale(12, RoundingMode.HALF_UP));

	}

}
