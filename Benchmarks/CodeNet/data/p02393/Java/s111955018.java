
import java.util.Scanner;

public class SortingThreeNumber {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int value[] = new int[3];

		int temp = 0, i = 0, j = 0;

		for (i = 0; i < 3; i++)

			value[i] = stdin.nextInt();

		for (i = 0; i < 3; i++) {

			for (j = i; j < 3; j++) {

				if (value[i] > value[j]) {

					temp = value[i];

					value[i] = value[j];

					value[j] = temp;

				}

			}

		}
		System.out.print(value[0]);

		System.out.print(" ");

		System.out.print(value[1]);

		System.out.print(" ");

		System.out.println(value[2]);
	}
}