import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			int x = Integer.parseInt(br.readLine());
			int factorial = 1;

			for (int i = 1; i <= x; i++) {

				factorial *= i;

			}

			System.out.println(factorial);

		} finally {
			br.close();

		}
	}
}