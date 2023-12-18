
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		boolean bool = false;

		for (int i = 0; i <= N / 4; i++) {
			for (int j = 0; j <= N / 7; j++) {

				if (N == (4 * i + 7 * j)) {
					bool = true;
				}
			}
		}

		System.out.print(bool == true ? "Yes" : "No");
	}
}