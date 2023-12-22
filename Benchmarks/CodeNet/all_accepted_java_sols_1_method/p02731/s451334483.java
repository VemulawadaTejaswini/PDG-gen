import java.util.*;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		BigDecimal a = BigDecimal.valueOf(L);
		BigDecimal b = BigDecimal.valueOf(27);
		BigDecimal sum = a.multiply(a.multiply(a));
		BigDecimal ans = sum.divide(b, 7, BigDecimal.ROUND_HALF_UP);

		System.out.println(ans);
	}
}