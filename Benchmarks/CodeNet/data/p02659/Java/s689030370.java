import java.math.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		MathContext ctx = new MathContext(0, RoundingMode.DOWN);
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		System.out.println(A.multiply(B).round(ctx).toBigIntegerExact());
	}
}
