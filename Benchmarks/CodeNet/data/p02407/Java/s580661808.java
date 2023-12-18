import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = input();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {

			list.add(input());

		}

		for (int j = n; j > 0; j--) {

			if (j !=1) {

				System.out.print(list.get(j - 1));
				System.out.print(" ");

			} else {

				System.out.println(list.get(j - 1));

			}
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