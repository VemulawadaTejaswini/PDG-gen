
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double num ;
		while((num = sc.nextDouble()) != 0) {
			
			double divisor = 0;
		
			for(double i = 1;i * i <= num;i++) {
				if(num % i == 0) {
					if(Math.pow(i, 2) == num) {
						divisor += i;
					}else {
						divisor += i + num / i;
					}
				}
			}
			
			divisor -= num;
			
			if(divisor == num) {
				System.out.println("perfect number");
			}else if(divisor < num) {
				System.out.println("deficient number");
			}else {
				System.out.println("abundant number");
			}
		}
	}

}

