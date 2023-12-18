
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		BigDecimal A = new BigDecimal(a);
		BigDecimal B = new BigDecimal(b);
		BigDecimal C = A.multiply(B);
		BigDecimal D = C.setScale(1);
		
		long ans = D.longValue();
		System.out.println(ans);
	}
}
