import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String s = "-1";
		for(double i = 0D ; i < 10050D ; i += 1D) {
			if(Math.floor(i * 0.08D) == Math.floor(a) && Math.floor(i * 0.10D) == Math.floor(b)){
				BigDecimal bd = new BigDecimal(String.valueOf(i));
				BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
				s = bd1.toPlainString();
				break;
			}
		}
		sc.close();
			System.out.println(s);
	}
}

