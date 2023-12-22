import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean[] is_prime = new boolean[1000000];
		for (int i = 0; i < 1000000; ++i) {
			is_prime[i] = true;
		}
		is_prime[0] = is_prime[1] = false;
		for (int i = 2; i < 1000000; ++i) {
			if (is_prime[i]) {
				for (int j = 2; i * j < 1000000; ++j) {
					is_prime[i * j] = false;
				}
			}
		}
		int[] count_prime = new int[1000000];
		for (int i = 0; i < 1000000; ++i) {
			if (is_prime[i]) ++count_prime[i];
		}
		for (int i = 0; i < 999999; ++i) {
			count_prime[i + 1] += count_prime[i];
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(count_prime[n]);
		}
		sc.close();
	}
}
