import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		final long T = sc.nextLong();
		long[] t = new long[n];
		Arrays.setAll(t, i -> sc.nextLong());
		
		long sum = T;
		for (int i = 1; i < n; i++) {
			long dif = t[i] - t[i - 1];
			sum -= Math.max(0, T - dif);
			sum += T;
		}
		
		System.out.println(sum);
	}
}
