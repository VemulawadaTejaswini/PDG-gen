import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			String a1 = sc.next();
			String b1 = sc.next();
			BigDecimal a = new BigDecimal(a1);
			BigDecimal b = new BigDecimal(b1);
			BigDecimal ret = a.multiply(b);
			ret = ret.setScale(0,RoundingMode.DOWN);
			
			System.out.println(ret);
		}
		
	}
