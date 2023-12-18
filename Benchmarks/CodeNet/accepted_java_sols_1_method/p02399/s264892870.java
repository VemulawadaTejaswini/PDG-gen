import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int a = scan.nextInt();
		int b = scan.nextInt();
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);

		int d = a /b;
		int r = a % b;
		double f = (double)a/b;
		BigDecimal src = BigDecimal.valueOf(f);
		src  = src.setScale(6, BigDecimal.ROUND_DOWN);
		
		System.out.println(d+" "+r+" "+src);
	}
}

