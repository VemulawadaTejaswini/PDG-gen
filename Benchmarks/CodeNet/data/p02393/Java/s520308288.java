import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 3;i++) {

			list.add(input());

		}

		Collections.sort(list);

		for (int j = 0; j < 3; j++) {

			System.out.print(list.get(j) + " ");

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