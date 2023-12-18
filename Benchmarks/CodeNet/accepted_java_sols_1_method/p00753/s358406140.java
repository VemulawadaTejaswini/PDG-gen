import java.util.Scanner;
public class Main {
	static int N = 123459 * 2;
	static boolean[] primes = new boolean[N]; 
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i < N; i++) {
			if (primes[i]) {
				for (int j = i * 2; j < N; j += i) {
					primes[j] = false;
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0) {
			int cnt = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (primes[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}