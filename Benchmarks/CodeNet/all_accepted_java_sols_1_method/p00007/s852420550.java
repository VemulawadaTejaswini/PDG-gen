import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static double debt = 100000;

	public static void main(String[] args) throws IOException {

		int n;
		double hell = debt;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			hell += hell * 0.05;
			hell = Math.ceil(hell / 1000) * 1000;
		}

		System.out.println((int) hell);
	}
}