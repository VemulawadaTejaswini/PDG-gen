import java.util.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal A = sc.nextBigDecimal();
		BigDecimal B = new BigDecimal((int)(sc.nextDouble() * 100 + 0.5));
		BigDecimal ans = A.multiply(B);
		ans = ans.divide(BigDecimal.valueOf(100));
		ans = ans.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.print(ans);
	}
}
