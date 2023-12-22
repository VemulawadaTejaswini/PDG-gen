import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws NumberFormatException {
		Scanner scan = new Scanner(System.in);
		while(true){
			BigDecimal x = scan.nextBigDecimal();
			if(x.equals(BigDecimal.ZERO)){
				break;
			}
			int sum = 0;
			for(; !x.equals(BigDecimal.ZERO); x = x.divide(BigDecimal.TEN, 0, BigDecimal.ROUND_DOWN)){
				BigDecimal amari = x.divide(BigDecimal.TEN, 0, BigDecimal.ROUND_DOWN);
				amari = amari.multiply(BigDecimal.TEN);
				sum += x.subtract(amari).intValue();
			}
			System.out.println(sum);
		}
	}
}