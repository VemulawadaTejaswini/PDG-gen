
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int num = 1000000;
		boolean[] primes = new boolean[num];
		int[] counts = new int[num];
		for (int i = 2; i < num/ 2 + 1; i++) {
			if (!primes[i]) {
				for (int j = 2; j < 999999 / i + 1; j++) {
					primes[i * j] = true;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (!primes[i]) {
				count++;
			}
			counts[i] = count;
		}
		String s;
		while ((s = reader.readLine()) != null) {
			System.out.println(counts[Integer.parseInt(s)]);
		}
	}

}