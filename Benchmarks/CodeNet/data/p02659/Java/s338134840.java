import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			BigDecimal s = scan.nextBigDecimal();
			BigDecimal k =scan.nextBigDecimal();
			
			BigDecimal C= s.multiply(k);
			
			
		
			
			
			/*
			long goukei = 0;
			int k = (int)(100.0*B);
			int a = k%10;//1
			k/=10;
			int b = k%10;//10
			k/=10;
			int c = k%10;//100
			
			
			
			goukei+=(long)c*A;
			long x = A*(long)b/10;
			long y = A*(long)a/100;
			
			goukei+=x+y;
			*/
			
	
			System.out.println(C.longValue());
			//System.out.println();
			
			
			
			
			
			
		}
		
		
	}
		

}
