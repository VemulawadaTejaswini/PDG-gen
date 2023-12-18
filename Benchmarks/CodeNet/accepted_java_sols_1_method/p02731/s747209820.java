import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		double x = L;
		BigDecimal div = new BigDecimal(String.valueOf(27.0));
		BigDecimal x2 = new BigDecimal(String.valueOf(x));
		BigDecimal ans = (x2.multiply((x2.multiply(x2))))
				.divide(div,7,RoundingMode.HALF_UP);
		System.out.println(ans.toPlainString());
		
	}

}