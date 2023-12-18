import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num1, num2, dividend, divisor, surplus;
		
		while(scan.hasNext()) {
			num1 = scan.nextLong();
			num2 = scan.nextLong();
			
			if(num1 < num2) {
				dividend = num2;
				divisor = num1;
			} else {
				dividend = num1;
				divisor = num2;
			}
			
			surplus = dividend % divisor;
			while(surplus != 0) {
				dividend = divisor;
				divisor = surplus;
				surplus = dividend % divisor;
			}
			long gcd = divisor;
			long lcm = num1 * num2 / divisor;
			
			System.out.printf("%d %d\n", gcd, lcm);
			
		}
	}
}