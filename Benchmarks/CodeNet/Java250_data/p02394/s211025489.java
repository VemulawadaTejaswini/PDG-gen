import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5;i++) {

			list.add(input());

		}

		int W = list.get(0);
		int H = list.get(1);
		int x = list.get(2);
		int y = list.get(3);
		int r = list.get(4);

		if ((x + r <= W) && (0 <= x - r) && (y + r <= H) && (0 <= y - r)) {

			System.out.println("Yes");

		} else {

			System.out.println("No");

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