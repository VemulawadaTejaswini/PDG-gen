import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int N = input();

		for (int i = 0; i < N; i++) {

			ArrayList<Integer> numList = new ArrayList<>();

			for (int j = 0; j < 3; j++) {

				numList.add(input());

			}

			Collections.sort(numList);

			if (isRight(numList.get(2), numList.get(1), numList.get(0))) {

				System.out.println("YES");

			} else {

				System.out.println("NO");

			}
		}

		close();

	}

	public static boolean isRight(int longSide, int shortSideA, int shortSideB) {

		return Math.pow(longSide, 2) == Math.pow(shortSideA, 2) + Math.pow(shortSideB, 2);

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