import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		long sum = 0L;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				// FizzBuzz
			}
			else if(i % 3 == 0 || i % 5 == 0) {
				// Fizz, Buzz
			}
			else {
				sum += i;
			}
		}
		System.out.println(sum);

		// 後始末
		sca.close();
	}
}