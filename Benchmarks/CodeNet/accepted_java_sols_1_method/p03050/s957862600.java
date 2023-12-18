import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		long ans = 0;
		long root = (long) Math.sqrt((double) n);
		for (int i = 1; i <= root; i++) {
			if ((n - i) % i == 0 && (n - i) / i > i) {
				ans += (n - i) / i;
			}
		}
		System.out.println(ans);
	}
}
