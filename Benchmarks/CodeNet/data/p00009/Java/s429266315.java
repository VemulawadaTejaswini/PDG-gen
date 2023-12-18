import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader sr = null;
		Scanner sc = null;

		try {

			sc = new Scanner(sr = new InputStreamReader(System.in));

			String s;
			boolean isPrime = true;
			int count = 0;

			while ((s = sc.next()) != null) {

				for (int i = 3; i <= Integer.parseInt(s); i += 2) {

					for (int j = 3; j < Math.sqrt(i); j += 2) {

						if (i % j == 0) {
							isPrime = false;
							break;
						}

					}

					if (isPrime) {
						count++;
					} else {
						isPrime = true;
					}

				}
				System.out.println(count);
				count = 0;

			}

		} finally {
			sr.close();
			sc.close();
		}

	}
}