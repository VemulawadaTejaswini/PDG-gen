import java.util.Scanner;
import java.math.*;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		
		int d = a / b;
		int r = a % b;
		double f = (double)a / b;
		
		System.out.println(d + " " +r+ " " + BigDecimal.valueOf(f).toPlainString());
	}
}