
/*
 * @author Raj Sharma
 * Description Print the number of combinations o four integers.
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[51];
		for (int a = 0; a <= 9; a++)
			for (int b = 0; b <= 9; b++)
				for (int c = 0; c <= 9; c++)
					for (int d = 0; d <= 9; d++)
						num[a + b + c + d]++; // Array index contains the no. of
												// combinations

		int index = 0;
		while ((index = scanner.nextInt()) != -1) {
			if (index > 50) {
				System.out.println("Wrong input try again. Enter between 0 t0 50");
			} else {
				System.out.println(num[index]); // Print the index based on the
												// input.
			}

		}

	}
}