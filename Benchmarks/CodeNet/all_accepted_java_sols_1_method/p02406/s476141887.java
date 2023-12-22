
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for (int j = 1; j <= m; j++) {
			if (j % 3 == 0) {
				System.out.print(" "+j );
				continue;
			}

			for (int i = j; i > 0; i /= 10) {
				if (i % 10 == 3) {
					System.out.print(" "+j );
					break;
				}
			}

		}
		System.out.println();
		sc.close();
	}
}