import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		BigDecimal aa = new BigDecimal(String.valueOf(a));
		BigDecimal bb = new BigDecimal(String.valueOf(b));
		BigDecimal ans = aa.multiply(bb);
		ans = ans.setScale(0, RoundingMode.DOWN);
		System.out.println(ans);
	}
}
