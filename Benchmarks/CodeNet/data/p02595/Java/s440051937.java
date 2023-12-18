import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var d = (long)sc.nextInt();
		var x = new long[n];
		var y = new long[n];
		for (var i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		var count = 0;
		for (var i = 0; i < n; i++) {
			if (x[i] * x[i] + y[i] * y[i] <= d * d) {
				count++;
			}
		}
		System.out.println(count);
	}
}
