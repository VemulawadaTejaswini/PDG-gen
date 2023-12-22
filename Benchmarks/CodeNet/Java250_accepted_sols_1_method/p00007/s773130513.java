import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		double a = 100000;
		
		for (int x = 1 ; x <= n ; x++){
			
			a = a * (1.05) ;
			double b = a / 1000 ;
			
			BigDecimal bib = new BigDecimal (String.valueOf(b));
			b =bib.setScale(0, BigDecimal.ROUND_UP).doubleValue();
			
			a = b * 1000;
			
		}
		
		int c = (int)a;
		System.out.println(c);
	}

}