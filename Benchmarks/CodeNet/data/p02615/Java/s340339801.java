import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var a = new Long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long sum = 0;
		for (int i = 1; i < n ; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
