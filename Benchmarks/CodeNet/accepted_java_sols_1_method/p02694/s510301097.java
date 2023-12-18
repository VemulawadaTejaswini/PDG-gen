import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		long n = stdIn.nextLong();
		stdIn.close();
		long money = 100;

		long year = 0;
		while (true) {
			year++;
			money = (long) (1.01 * (double)money);

			if(money >= n) {
				break;
			}
		}

		System.out.println(year);

	}
}
