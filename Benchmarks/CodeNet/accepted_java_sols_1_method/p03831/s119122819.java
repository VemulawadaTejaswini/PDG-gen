import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long total = 0;
		long prev = sc.nextInt();
		for (int i = 1; i < n; i++) {
			long tmp = sc.nextInt();
			total += Math.min((tmp - prev) * a, b);
			prev = tmp;
		}
		System.out.println(total);
	}
}
