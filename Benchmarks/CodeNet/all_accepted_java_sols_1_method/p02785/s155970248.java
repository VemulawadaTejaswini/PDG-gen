import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long h[] = new long[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextLong();
		}
		Arrays.sort(h);

		for(int i = 0; i < h.length - k; i++) {
			sum += h[i];
		}

		System.out.println(sum);

		sc.close();
	}
}