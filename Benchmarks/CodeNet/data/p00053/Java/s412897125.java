import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Sum of Prime Numbers
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Prime prime = main.new Prime();

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			System.out.println(prime.calcTo(n).sumTo(n));

		}

	}

	class Prime {
		List<Integer> primes;

		Prime() {
			primes = new ArrayList<Integer>();
			primes.add(0);
			primes.add(2);
			primes.add(3);
			primes.add(5);
			primes.add(7);
		}

		Prime calcTo(int index) {

			int sta = primes.get(primes.size() - 1);

			for (int i = sta;; i++) {

				if (primes.size() > index) {
					break;
				}

				for (int j = 1; j < primes.size(); j++) {
					if (i % primes.get(j) == 0) {
						break;
					} else {
						if (j == primes.size() - 1) {
							primes.add(i);
						}
					}
				}
			}
			return this;
		}

		int sumTo(int index) {
			int result = 0;
			if (index < primes.size()) {
				for (int i = 1; i <= index; i++) {
					result += primes.get(i);
				}
			}
			return result;
		}

	}

}