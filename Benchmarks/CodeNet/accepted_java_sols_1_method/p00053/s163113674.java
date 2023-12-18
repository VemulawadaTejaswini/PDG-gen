
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		while (true) {
			int a = Integer.parseInt(reader.readLine());
			if (a == 0)
				break;
			int[] primes = new int[a * 100];
			for (int i = 2; i < a * 100; i++) {
				if (primes[i] == 1) {
					continue;
				}
				for (int j = i * 2; j < a * 100; j += i) {
					primes[j] = 1;
				}
			}
			int count = 0;
			long sum = 0;
			for (int i = 2; i < a * 100; i++) {
				if (primes[i] == 0) {
					sum += i;
					count++;
					if (count == a) {
						break;
					}
				}
			}
			System.out.println(sum);
		}

	}
}