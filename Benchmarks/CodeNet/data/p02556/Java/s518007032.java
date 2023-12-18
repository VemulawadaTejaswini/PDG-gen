import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var x = new int[n];
		var y = new int[n];
		for (var i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		var min1 = Integer.MAX_VALUE;
		var max1 = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			min1 = Math.min(min1, x[i] + y[i]);
			max1 = Math.max(max1, x[i] + y[i]);
		}
		var min2 = Integer.MAX_VALUE;
		var max2 = Integer.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			min2 = Math.min(min2, x[i] - y[i]);
			max2 = Math.max(max2, x[i] - y[i]);
		}

		var max = Math.max(max1 - min1, max2 - min2);
		System.out.println(max);
	}
}
