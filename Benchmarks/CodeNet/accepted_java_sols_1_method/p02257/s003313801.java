import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int len = input1.nextInt();
		int total = 0;
		int num;
		boolean isPrime;

		for (int i = 0; i < len; i++) {
			num = input1.nextInt();
			isPrime = true;

			// check the base case
			if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11) {
				isPrime = true;
				;
			}
			// if numbers can be divided by 2,3,5,7,11, it is not a prime number
			else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0) {
				isPrime = false;
			} else {
				// a final check
				for (int j = 3; j <= Math.sqrt(num); j++) {
					if (num % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				total++;
			}
		}
		System.out.println(total);
	}
}

