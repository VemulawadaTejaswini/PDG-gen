
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

			while ((s = sc.nextLine()) != null) {

				System.out.print(s.toUpperCase());

			}

		}

		finally {
			sr.close();
			sc.close();
		}

	}
}