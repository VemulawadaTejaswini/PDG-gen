import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == -1) {
				break;
			}

			ArrayList<Integer> primes = new ArrayList<Integer>();
			if (N < 2) {
				primes.add(2);
				N = 3;
			} else if (N % 2 == 0) {
				N++;
			} else {
				N += 2;
			}
			while (primes.size() <= 30) {
				boolean is_prime = true;
				for (int i = 2; i < Math.sqrt(N) + 1; i++) {
					if (N % i == 0) {
						is_prime = false;
						break;
					}
				}
				if (is_prime) {
					primes.add(N);
				}
				N += 2;
			}

			ArrayList<Integer> matsuzaki = new ArrayList<Integer>();
			for (int i = 0; i < primes.size(); i++) {
				for (int j = i; j < primes.size(); j++) {
					matsuzaki.add(primes.get(i) + primes.get(j));
				}
			}

			Collections.sort(matsuzaki);

			int P = nextInt();
			System.out.println(matsuzaki.get(P - 1));

		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}