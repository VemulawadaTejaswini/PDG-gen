import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int Y = scan.nextInt();
		int sum = 0;

		for (int i = 0; i < 2; i++) {

			if (X >= Y) {

				sum += X;
				X = X - 1;

			} else {

				sum += Y;
				Y = Y - 1;
			}

		}

		
		System.out.println(sum);
		
	}

}
