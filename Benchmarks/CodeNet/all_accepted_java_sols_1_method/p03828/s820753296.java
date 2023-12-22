import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] yaku = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int target = i;
			for (int j = 2; j <= i; j++) {
				while (target % j == 0) {
					target /= j;
					yaku[j]++;
				}
			}
		}
		long mod = 1000000007;
		long count = 1;
		for (int i = 0; i <= n; i++) {
			count *= yaku[i] + 1;
			count %= mod;
		}
		System.out.println(count);
	}
}