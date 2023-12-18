import java.util.*;

public class Main {
	static final int MOD = 2019;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (b - a > MOD) {
			System.out.println(0);
			return;
		}
		int min = Integer.MAX_VALUE;
		for (int i = a; i < b; i++) {
			for (int j = i + 1; j <= b; j++) {
				min = Math.min(min, ((i % MOD) * (j % MOD) % MOD));
			}
		}
		System.out.println(min);
	}
}
