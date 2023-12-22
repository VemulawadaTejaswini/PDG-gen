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
		for (int i = 0; i < n - 1; i++) {
			sum += Math.min(T, t[i + 1] - t[i]);
		}
		
		System.out.println(sum);
	}
}
