import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedInputStream sr = null;
		Scanner sc = null;
		String s;
		boolean isPrime = true;
		int count = 0;

		try {

			sc = new Scanner(sr = new BufferedInputStream(System.in));

			while ((s = sc.next()) != null) {

				if (Integer.parseInt(s) == 2) {
					count++;
					System.out.println(count);

				} else {

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
			}
		} catch (NoSuchElementException e) {

		}

		finally {
			sr.close();
			sc.close();
		}

	}
}