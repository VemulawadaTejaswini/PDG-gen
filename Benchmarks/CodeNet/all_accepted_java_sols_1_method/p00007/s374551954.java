import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int debt = 100000;

		Double interest = 1.05;

		for (int i = 0; i < n; i++) {

			debt *= interest;

			if (!(debt % 1000 == 0)) {
				debt /= 1000;
				debt++;
				debt *= 1000;
			}

		}

		System.out.println(debt);

	}

}