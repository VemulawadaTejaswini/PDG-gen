import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		
		//long a = scan.nextLong();
		//double b = scan.nextDouble() * 100;
		 
		BigDecimal a1 = new BigDecimal(scan.nextLong());
		BigDecimal b1 = new BigDecimal(scan.nextDouble()*100);
		
		long answer = a1.multiply(b1).longValue() / 100;
		
		//long ans = (long) (a * (b * 100) / 100);
		
		System.out.println(answer);
		
		}

}
