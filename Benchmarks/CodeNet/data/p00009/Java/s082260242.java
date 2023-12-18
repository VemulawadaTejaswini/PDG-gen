import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			int numberOfprimes = 0;
			int n = Integer.parseInt(scan.next());

			for (int i = 2; i <= n; i++) {
				boolean isPrime = true;
				if ((i % 2) != 0 || i == 2) {
					for (int j = 2; j < i; j++) {
						if ((i % j) == 0 && i != j) {
							isPrime = false;
						}
					}
					if (isPrime)
						numberOfprimes++;
				}

			}
			System.out.println(numberOfprimes);
		}
	}
}