
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();

			if (a[i] == 0) {
				System.out.println(i + 1);
				break;
			}

		}

	}

}
