import java.util.*;
import java.math.BigDecimal;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		BigDecimal b1 = new BigDecimal(sc.next());
		BigDecimal b2 = new BigDecimal(100.0);
		long B = b1.multiply(b2).longValue();
		System.out.println((A*B)/100);
		
		sc.close();
	}
}