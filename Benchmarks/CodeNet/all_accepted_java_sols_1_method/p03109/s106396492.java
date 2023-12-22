import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.next().split("/");

		int y = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		if (y < 2019) {
			System.out.println("Heisei");
		} else if (y == 2019) {
			if (m < 5) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}
		} else {
			System.out.println("TBD");
		}

		sc.close();
	}
}
