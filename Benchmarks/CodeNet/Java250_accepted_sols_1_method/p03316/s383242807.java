import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int tmp = n;

		while (tmp != 0) {
			sum += tmp % 10;
			tmp /= 10;
		}

		System.out.println(n % sum == 0 ? "Yes" : "No");

		sc.close();
	}
}
