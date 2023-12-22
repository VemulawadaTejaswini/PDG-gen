import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long t = sc.nextLong();
		long[] a = new long[n];
		for(int i = 0 ; i  <n ; i++) a[i] = sc.nextLong();
		long ans = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			ans += Math.min(a[i + 1] - a[i], t);
		}
		System.out.println(ans + t);
	}
}