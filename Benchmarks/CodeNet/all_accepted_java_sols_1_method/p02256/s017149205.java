import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int largestDenominator = 1;
		
		for (int i = 1; i < Math.sqrt((double) Math.max(a,  b)); i++) {
			if (a % i == 0) {
				if (b % (a / i) == 0) {
					largestDenominator = Math.max(largestDenominator, (a / i));
break;
				} else if (b % i == 0) {
					largestDenominator = Math.max(largestDenominator, i);
				}
			}
		}
		
		System.out.println(largestDenominator);
	}
}
