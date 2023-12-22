import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int lowerLimit = 0;
		final int upperLimit = 1000000;
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			if((num1 >= lowerLimit && num1 <= upperLimit)
				&& (num2 >= lowerLimit && num2 <= upperLimit)) {
				System.out.println((int)Math.log10(num1 + num2) + 1);		
			} else {
				continue;
			}
		}
	}
}