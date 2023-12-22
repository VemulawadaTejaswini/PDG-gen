import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int digit = 0;
		while (n >= k) {
			n = n / k;
			digit++;
		}

		if (n <= (k - 1)) {
			digit++;
		}

		System.out.println(digit);

		sc.close();
	}
}
