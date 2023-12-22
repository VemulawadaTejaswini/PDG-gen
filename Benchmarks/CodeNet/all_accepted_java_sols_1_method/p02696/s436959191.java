import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		BigDecimal N = new BigDecimal(sc.next());
		BigDecimal MAX = BigDecimal.ZERO;
		if (N.compareTo(B) != -1) {
			MAX = A.multiply(B.subtract(BigDecimal.ONE)).divide(B, 0, RoundingMode.DOWN);
		} else {
			MAX = A.multiply(N).divide(B, 0, RoundingMode.DOWN).subtract(A.multiply(N.divide(B, 0, RoundingMode.DOWN)));
		}
		System.out.println(MAX);
	}

}
