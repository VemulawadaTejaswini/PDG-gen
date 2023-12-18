import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		
		//long a = scan.nextLong();
		//double b = scan.nextDouble() * 100;
		 
		BigDecimal a1 = new BigDecimal(scan.nextLong());
		BigDecimal b1 = new BigDecimal(scan.nextDouble());
		
		BigDecimal answer = a1.multiply(b1);
		answer = answer.setScale(0, RoundingMode.DOWN);
		
		//long ans = (long) (a * (b * 100) / 100);
		
		System.out.println(answer);
		
		}

}
