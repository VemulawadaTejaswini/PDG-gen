import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				int n = Integer.parseInt(line);
				System.out.println(fact(n));
			}
		}
	}

	public static long fact(long n) {
		if (n <= 1) {
			return n;
		}
		return n * fact(n - 1);
	}
}