import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double T = sc.nextInt();
		double X = sc.nextInt();
//		String A = sc.next();

		double answer = T/X;

		 String str = BigDecimal.valueOf(answer).toPlainString();


		 System.out.println(answer);
	}
}
