import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String line = br.readLine();
				int N = Integer.parseInt(line);
				if (N <= 1) {
					break;
				}
				int count = sieveOfEratosthenes(N).size();
				System.out.println("count = " + count);
			}
		} catch (IOException e) {
			System.out.println("exit by IOException");
		} catch (NumberFormatException e) {
			System.out.println("end of input");
		}
	}

	public static List<Integer> sieveOfEratosthenes(int n) {
		if (n <= 1) {
			return null;
		}

		boolean[] list = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			list[i] = true;
		}

		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i * i <= n; i++) {
			if (list[i]) {
				primes.add(new Integer(i));
				for (int j = i; j <= n; j += i) {
					list[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (list[i]) {
				primes.add(new Integer(i));
			}
		}

		return primes;
	}
}