import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[1000];
		int y[] = new int[1000];
		int i = 0;
		while (true) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if (x[i] == 0 && y[i] == 0)
				break;

			i++;

		}

		for (int j = 0; j < i; j++) {
			for (int m = 0; m < x[j]; m++) {

				for (int k = 0; k < y[j]; k++) {
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}

		// System.out.printf("ok %d %d", i, vec[i]);
	}

}