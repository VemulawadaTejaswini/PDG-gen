import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal multiSum = BigDecimal.ONE;
		BigDecimal let;
		MathContext mc = new MathContext(20,RoundingMode.HALF_UP);


		for (int i = 0; i < N; i++) {
			let = new BigDecimal(sc.next());
			sum = sum.add(BigDecimal.ONE.divide(let,mc));
		}

		System.out.println(BigDecimal.ONE.divide(sum,mc));

	}
}


