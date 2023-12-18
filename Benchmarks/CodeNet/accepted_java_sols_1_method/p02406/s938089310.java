import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		String blank = " ";
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x %3 == 0) {
				System.out.print(blank + i);
				continue;
			}
			if (x %10 == 3) {
				System.out.print(blank + i);
				continue;
			}
			while ((x/= 10) != 0) {
				if (x %10 == 3) {
					System.out.print(blank + i);
					break;
				}
			}
		}
		System.out.println("");
	}
}