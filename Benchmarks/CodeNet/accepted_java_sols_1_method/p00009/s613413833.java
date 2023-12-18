import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] a = new int[1000000];
		a[1] = 0;
		boolean[] isPrime = new boolean[1000000];
		Arrays.fill(isPrime, true);
		for (int i = 2; i < 1000000; i++) {
			a[i] = a[i - 1];
			if (isPrime[i]) {
				a[i]++;
				for (int j = i * 2; j < 1000000; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println(a[n]);
		}
	}
}