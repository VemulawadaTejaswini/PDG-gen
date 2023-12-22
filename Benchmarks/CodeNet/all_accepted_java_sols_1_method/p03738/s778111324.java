
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
				
		
		if (b.compareTo(a) < 0) {
			System.out.println("GREATER");
		} else if (b.compareTo(a) == 0) {
			System.out.println("EQUAL");
		} else {
			System.out.println("LESS");
		}
	}
}