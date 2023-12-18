import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String in[] =  scan.nextLine().split(" ");
		BigDecimal A =  new BigDecimal(in[0]);
		BigDecimal B = new BigDecimal(in[1]);

		System.out.println(A.multiply(B).longValue());
	}
}