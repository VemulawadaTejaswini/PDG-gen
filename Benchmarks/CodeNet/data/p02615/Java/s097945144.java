import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		for (var i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);

		var count = 0;
		for (var i = n - 2; i >= 0; i--) {
			count += a[i + 1];
		}
		System.out.println(count);
	}
}
