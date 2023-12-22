import java.math.BigDecimal;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BigDecimal a = new BigDecimal(scan.next());
		BigDecimal b = new BigDecimal(scan.next());
		BigDecimal tmp = a.multiply(b);
		long ans = tmp.longValue();
		System.out.print(ans);


	}
}