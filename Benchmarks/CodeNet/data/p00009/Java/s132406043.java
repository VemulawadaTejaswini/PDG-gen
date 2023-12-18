import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			String s;
			boolean isPrime = true;
			int count = 0;

			while ((s = br.readLine()) != null) {

				for (int i = 3; i <= Integer.parseInt(s);i+=2) {

					for (int j = 3; j < i;j+=2) {

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
				System.out.println(count+1);
				count = 0;

			}

		} finally {
			br.close();
		}

	}
}