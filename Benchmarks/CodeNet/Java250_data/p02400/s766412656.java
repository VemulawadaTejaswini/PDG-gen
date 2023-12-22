import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigDecimal r = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal pi = BigDecimal.valueOf(Math.PI);
		
		System.out.println(r.pow(2).multiply(pi) + " " + BigDecimal.valueOf(2).multiply(pi).multiply(r));
		
		sc.close();
	}

}