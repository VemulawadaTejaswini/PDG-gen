
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String s;
		while ((s = reader.readLine()) != null) {
			int a = Integer.parseInt(s);
			System.out.println(getPrime(a));

		}

	}

	public static int getPrime(int a) {
		int count = 0;
		for (int i = 2; i <= a; i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}