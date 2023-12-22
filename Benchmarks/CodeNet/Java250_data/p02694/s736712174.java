import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class  Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String K = (sc.next());
		BigDecimal X = new BigDecimal(K);
		BigInteger t = BigInteger.valueOf(100);
		BigDecimal T = new BigDecimal(t);
		int year = 1;
		while ((T.multiply(BigDecimal.valueOf(1.01))).compareTo(X) == -1) {
			t = (T.multiply(BigDecimal.valueOf(1.01))).toBigInteger();
			T = new BigDecimal(t);
			year++;
		}
		System.out.println(year);
	}
}
