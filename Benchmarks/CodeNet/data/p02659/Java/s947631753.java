import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		BigDecimal bA = new BigDecimal(A);
		BigDecimal bB = new BigDecimal(B);
		BigDecimal ans = bA.multiply(bB);
		ans = ans.setScale(0, RoundingMode.DOWN);

		System.out.println(ans);

	}

}