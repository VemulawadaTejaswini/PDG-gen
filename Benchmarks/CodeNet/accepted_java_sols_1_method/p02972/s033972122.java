import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		int[] ans = new int[n + 1];
		int count = 0;
		for (int i = n; i > 0; i--) {
			int sum = 0;
			for (int j = 1; i * j <= n; j++) {
				sum += ans[i * j];
			}
			if (sum % 2 != a[i]) {
				ans[i] = 1;
				count++;
			}
		}
		System.out.println(count);
		for (int i = 1; i <= n; i++) {
			if (ans[i] == 1) {
				System.out.println(i);
			}
		}
	}
}