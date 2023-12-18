import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	private static final BigDecimal BORROWING = BigDecimal.valueOf(100000);
	private static final BigDecimal RATE = new BigDecimal("1.05");
	private static final int SCALE = 3;
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		System.out.println(calc(BORROWING, RATE, n).toPlainString());
	}
	
	private static BigDecimal calc(BigDecimal start, BigDecimal rate, int n){
		BigDecimal ans = start;
		for (int i = 0; i < n; i++) {
			ans = calcParWeek(ans, rate);
		}
		return ans;
	}
	

	private static BigDecimal calcParWeek(BigDecimal start, BigDecimal rate){
		
		return start.multiply(RATE).movePointLeft(SCALE).setScale(0, RoundingMode.UP)
				.movePointRight(3);
		
	}

}