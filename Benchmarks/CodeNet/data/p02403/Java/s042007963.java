import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> hList = new ArrayList<Integer>();
		ArrayList<Integer> wList = new ArrayList<Integer>();
		int H = 0;
		int W = 0;

		while (true) {

			H = input();
			W = input();

			if (H == 0 && W == 0) {

				break;

			} else {

				hList.add(H);
				wList.add(W);

			}
		}

		for (int i = 0; i < hList.size(); i++) {

			for (int j = 1; j <= hList.get(i); j++) {

				for (int k = 1; k <=wList.get(i) ; k++) {

					System.out.print("#");

				}

				System.out.println("");

			}

			System.out.println("");

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