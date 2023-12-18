import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a / b + " " + a % b + " " + BigDecimal.valueOf((double)a / b).setScale(9, RoundingMode.HALF_UP));
		
		sc.close();
	}

}