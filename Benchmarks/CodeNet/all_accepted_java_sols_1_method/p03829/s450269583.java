import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long prev = 0;
		long total = 0;
		for (int i = 0; i < n; i++) {
			long x = sc.nextLong();
			if (i == 0) {
				prev = x;
				continue;
			}
			total += Math.min((x - prev) * a, b);
			prev = x;
		}
		System.out.println(total);
	}
}
