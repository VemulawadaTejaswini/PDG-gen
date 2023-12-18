import java.util.*;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		BigDecimal ad = new BigDecimal(""+a);
		BigDecimal bd = new BigDecimal(""+b);
		BigDecimal ans = ad.multiply(bd);
		ans = ans.setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(ans);
	}
}