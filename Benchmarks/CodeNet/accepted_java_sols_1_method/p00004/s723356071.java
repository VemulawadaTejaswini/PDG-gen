import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc =  new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		
		while ( sc.hasNext() ){
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();
		double e = sc.nextInt();
		double f = sc.nextInt();
		
		double x = ( c*e - b*f ) / ( a*e - b*d );
		double y = ( a*f - c*d ) / ( a*e - b*d );
		
		BigDecimal bix = new BigDecimal (String.valueOf(x));
		BigDecimal biy = new BigDecimal (String.valueOf(y));
		x =bix.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
		y =biy.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
				
		System.out.println(String.format("%.3f",x) +  " " +String.format("%.3f",y));
	
		}

	}

}