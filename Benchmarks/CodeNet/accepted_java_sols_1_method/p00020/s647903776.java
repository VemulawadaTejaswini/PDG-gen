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

			s = sc.nextLine();

				System.out.println(s.toUpperCase());

		}

		finally {
			sr.close();
			sc.close();
		}

	}
}