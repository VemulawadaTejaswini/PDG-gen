import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int ways = 5;
	static long[] a = new long[ways];
	static long n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = Long.parseLong(sc.next());
		for (int i = 0; i < ways; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		long min = Arrays.stream(a).min().orElse(0);
		long ans = (long) Math.ceil((double) n / min + 4);
		System.out.println(ans);

	}

}
