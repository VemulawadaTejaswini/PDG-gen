import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			
			b = b / a;
			c = c / a;
				
			e = e - b * d;
			f = f - c * d;
			d = 0;
						
			f = f / e;
			e = 1;
			
			c = c - f*b;			
			b = 0;
			
			BigDecimal x = new BigDecimal(c);
			BigDecimal y = new BigDecimal(f);
			
			x = x.setScale(3, RoundingMode.DOWN);
			y = y.setScale(3, RoundingMode.DOWN);
			
			System.out.println(x+" "+y);
		}
		
		
	}
}