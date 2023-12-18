import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan =new Scanner(System.in);
		long A=scan.nextLong();
		double B=scan.nextDouble();
		double a=A*B;

		BigDecimal kirisute = new BigDecimal(String.valueOf(a));
		BigDecimal A1 = kirisute.setScale(0, RoundingMode.DOWN);

		
		System.out.println(A1);
	}

}
