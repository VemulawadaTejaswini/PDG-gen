import java.util.Scanner;
import java.math.*;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		double r = Double.parseDouble(scan.next());
		
		double area = r * r * Math.PI;
		double perimeter = 2 * r * Math.PI;
		
		System.out.println(BigDecimal.valueOf(area).toPlainString() +" "+ BigDecimal.valueOf(perimeter).toPlainString());
	}
}