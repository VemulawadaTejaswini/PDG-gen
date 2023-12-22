
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		double n = scan.nextDouble();

		double output = 0;

		if (n == 1) {

			output = 1;

		} else if (n == 2) {

			output = 0.5;
		}

		if (n % 2 == 1) {

			output = ((int) (n / 2) + 1) / n;

		} else {

			output = (n / 2) / n;

		}

		System.out.println(output);
	}

}