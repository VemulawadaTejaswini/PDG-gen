import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = 1000000;
		int[] count = new int[N];
		boolean[] prime = new boolean[N];
		Arrays.fill(prime, true);
		for (int i = 2; i < N; i++) {
			count[i] = count[i - 1];
			if (prime[i]) {
				count[i]++;
				for (int j = i; j < N; j += i) {
					prime[j] = false;
				}
			}
		}
		while (scanner.hasNext())  {
			int n = scanner.nextInt();
			System.out.println(count[n]);
		}
	}
}