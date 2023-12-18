import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String A = reader.readLine();
		int r = Integer.parseInt(A);

		double S = r * r * 3.14;
		double l = 2 * r * 3.14;
		System.out.println("" + S + " " + l + "");

	}
}