import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long money = scanner.nextLong();

		long coins500 = money / 500;
		long remainder = money % 500;
		long coins5 = remainder / 5;
		
		long maxHappy = coins500 * 1000 + coins5 * 5;
		System.out.println(maxHappy);

		scanner.close();

	}

}
