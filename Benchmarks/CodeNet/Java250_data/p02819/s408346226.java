import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		if (x == 2) {
			System.out.println(2);
			return;
		}
		if (x % 2 == 0)
			x++;
		boolean isPrime;
		while (true) {
			isPrime = true;
			for (int i = 3; i * i <= x; i += 2) {
				if (x % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(x);
				return;
			}
			x += 2;
		}
	}

}
