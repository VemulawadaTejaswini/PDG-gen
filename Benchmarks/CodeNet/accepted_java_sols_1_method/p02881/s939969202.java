import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long num1 = 0;
		long num2 = 0;
		long distance = (long)Math.pow(10, 12);
		boolean judge = false;

		for(long i = 2;i <= Math.sqrt(n);i++) {
			if(n % i == 0) {
				judge = true;

				if(Math.abs((n / i) - i) < distance) {
					num1 = n / i;
					num2 = i;
				}
			}
		}

		if(judge) {
			System.out.println((num1 - 1) + (num2 - 1));
		}else {
			System.out.println(n - 1);
		}
	}
}
