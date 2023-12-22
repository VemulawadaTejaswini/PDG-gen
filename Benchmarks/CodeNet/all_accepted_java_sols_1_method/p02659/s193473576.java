import java.util.*;
import java.math.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal A = new BigDecimal(sc.next());
		BigDecimal B = new BigDecimal(sc.next());
		sc.close();
		BigDecimal ans = A.multiply(B);
		System.out.println(ans.setScale(0, RoundingMode.DOWN));

	}
}
