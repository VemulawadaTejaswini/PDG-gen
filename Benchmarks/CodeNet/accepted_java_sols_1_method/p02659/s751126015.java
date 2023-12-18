import java.math.BigDecimal;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
		double b = stdIn.nextDouble();
		
		
	//	System.out.println((long)Math.floor(a*b));
		
		
		BigDecimal bd1 = BigDecimal.valueOf(a);
		BigDecimal bd2 = BigDecimal.valueOf(b);
		
		BigDecimal ans = bd1.multiply(bd2).setScale(0,BigDecimal.ROUND_DOWN);
		
		System.out.println(ans);
		
		
		
		
	}

}
