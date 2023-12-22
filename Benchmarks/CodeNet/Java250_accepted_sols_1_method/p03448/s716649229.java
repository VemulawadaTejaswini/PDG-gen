import java.util.Scanner;

public class Main {

	public static void main(String[] count) {

		Scanner scan = new Scanner(System.in);

		int A500 = Integer.parseInt(scan.next());

		int B100 = Integer.parseInt(scan.next());

		int C50 = Integer.parseInt(scan.next());

		int Xtotal = Integer.parseInt(scan.next());

		scan.close();

		// start

		int result = 0;

		int counts = C50 * B100 * A500;
		int[][] array = new int[counts][3];

		for (int i = 0; i <= C50; i++) {
			for (int j = 0; j <= B100; j++) {
				for (int j2 = 0; j2 <= A500; j2++) {
					if ((50 * i + 100 * j + 500 * j2) == Xtotal) {
						result++;
					}

				}

			}

		}

		System.out.println(result);
	}

}
