import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> hight = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			hight.add(input());

		}

		Collections.sort(hight);

		System.out.println(hight.get(9));
		System.out.println(hight.get(8));
		System.out.println(hight.get(7));

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