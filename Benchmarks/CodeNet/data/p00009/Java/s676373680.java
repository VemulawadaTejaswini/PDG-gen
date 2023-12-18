import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		while (sc.hasNext() && m < 30) {
			int n = sc.nextInt();
			if (n <= 99999) {
				int c = 0;
				if (n >= 2) ++c;
				if (n >= 3) ++c;
				if (n >= 5) ++c;
				if (n >= 7) ++c;
				for (int i = 2; i <= n; i++) {
					if (!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)) {
						++c;
					}
				}
				System.out.println(c);
				++m;
			}
		}
	}

}