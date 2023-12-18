import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long ans = 0;
		for (int i = a.length - 2; i >= 0; i--) {
			ans += a[i + 1];
		}
		System.out.println(ans);
		sc.close();
	}
}