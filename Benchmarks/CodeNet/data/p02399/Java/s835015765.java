import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = a / b;
		int r = a % b;
		BigDecimal biga = BigDecimal.valueOf(a);
		BigDecimal bigb = BigDecimal.valueOf(b);
		BigDecimal f = biga.divide(bigb, 5, BigDecimal.ROUND_HALF_UP);
		
		System.out.println(d + " " + r + " " + f);
	}

}