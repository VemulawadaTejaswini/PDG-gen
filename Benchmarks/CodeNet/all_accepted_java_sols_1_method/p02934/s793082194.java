import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		BigDecimal result = new BigDecimal("1");
		int n = sc.nextInt();

		double sum = 0;

		for(int i=0;i < n;i++) {
			BigDecimal next = new BigDecimal(sc.nextInt());
			BigDecimal div = BigDecimal.ONE.divide(next,10,BigDecimal.ROUND_HALF_UP);
			sum += div.doubleValue();
		}

		System.out.println(BigDecimal.ONE.divide(new BigDecimal(sum),20,BigDecimal.ROUND_HALF_UP));

	}
}