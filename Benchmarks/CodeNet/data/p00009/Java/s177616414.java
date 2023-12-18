import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String s;
			List<Integer> primeQuantity = new ArrayList<Integer>();
			boolean isPrime = true;
			// ?´???°???????????????
			int count = 0;

			while ((s = br.readLine()) != null) {

				if (Integer.parseInt(s) >= 2) {

					count = 1;

				}

				for (int i = 3; i <= Integer.parseInt(s); i++) {

					for (int j = 2; j < i; j++) {

						if (i % j == 0) {
							isPrime = false;
						}

					}

					if (isPrime) {
						count++;
					} else {
						isPrime = true;
					}

				}
				primeQuantity.add(count);
				count = 0;

			}

			for (int prime : primeQuantity) {
				System.out.println(prime);
			}

		} finally {
			br.close();
		}

	}
}