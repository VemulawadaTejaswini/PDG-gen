import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long total = 0;
		for (int i = k + 1; i <= n; i++) {
			total += (n / i) * (i - k) + Math.max(n % i - k + 1, 0);
			if (k == 0) {
				total--;
			}
		}
		System.out.println(total);
	}
}
