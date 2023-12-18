import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		BigDecimal A = BigDecimal.valueOf(a);
		int b = in.nextInt();
		BigDecimal B = BigDecimal.valueOf(b);
		int c = in.nextInt();
		BigDecimal C = BigDecimal.valueOf(c);
		int d = in.nextInt();
		BigDecimal D = BigDecimal.valueOf(d);
		
		if(Math.signum(b) == 1.0 && Math.signum(d) == 1.0) {
			System.out.println(B.multiply(D));
		}else if(Math.signum(a) == -1.0 && Math.signum(c) == -1.0) {
			System.out.println(A.multiply(C));
		}else {
			BigDecimal AD = A.multiply(D);
			BigDecimal BC = B.multiply(C);
			if(AD.compareTo(BC) > 0) {
				System.out.println(AD);
			}else {
				System.out.println(BC);
			}
		}
	}
}
