import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal rate = BigDecimal.valueOf(Math.PI);
		
		BigDecimal beforeArea = a.multiply(a).multiply(rate);
		BigDecimal beforeLength = a.multiply(BigDecimal.valueOf(2.0)).multiply(rate);
		
		String afterArea = String.format("%.6f",beforeArea);
		String afterLength = String.format("%.6f",beforeLength);
		
		System.out.println(afterArea + " " + afterLength);
	}

}