import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal A = new BigDecimal(sc.nextLong());
		BigDecimal B = new BigDecimal(sc.nextLong());
		BigDecimal C = new BigDecimal(sc.nextLong());

		BigDecimal l = C.subtract(A).subtract(B);
		if (l.compareTo(BigDecimal.ZERO) != 1) {
			System.out.println("No");
		}else {
			if (l.multiply(l).compareTo(A.multiply(B).multiply(BigDecimal.valueOf(4))) != 1) {
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}

	}
}