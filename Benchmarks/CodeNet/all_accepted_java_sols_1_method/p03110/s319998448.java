import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		BigDecimal otosidama = new BigDecimal(0.0);
		for (int i=0; i<num; i++) {
			BigDecimal a = new BigDecimal(sc.next());
			String b = sc.next();
			
			if ("JPY".equals(b)) {
				otosidama = otosidama.add(a);
			} else {
				BigDecimal btc2yen = a.multiply(BigDecimal.valueOf(380000.0));
				otosidama = otosidama.add(btc2yen);
			}
		}
		System.out.println(otosidama.stripTrailingZeros().toPlainString());
	}
}
