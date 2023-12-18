import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> listN = new ArrayList<Integer>();
		ArrayList<Integer> listX = new ArrayList<Integer>();

		int count = 0;

		while (true) {

			int n = input();
			int x = input();

			if (n == 0 && x == 0) {

				break;

			} else {

				listN.add(n);
				listX.add(x);

			}
		}

		for (int i = 0; i < listN.size(); i++) {

			for (int j = 1; j <= listN.get(i); j++) {

				for (int k = j + 1; k <= listN.get(i); k++) {

					for (int l = k + 1; l <= listN.get(i); l++) {

						if (j + k + l == listX.get(i)) {

							count++;

						}
					}
				}
			}

			System.out.println(count);
			count = 0;

		}

		close();

	}

	public static int input() {

		return scanner.nextInt();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}