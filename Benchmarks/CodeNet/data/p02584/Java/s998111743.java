import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextLong();
		var k = sc.nextLong();
		var d = sc.nextLong();
		sc.close();

		var result = 0L;
		x = Math.abs(x);
		if (k < x / d) {
			result = x - k * d;
		} else if ((k - (x / d)) % 2 == 0) {
			result = Math.abs(x - d * (x / d));
		} else {
			result = Math.abs(x - d * ((x / d) + 1));
		}
		System.out.println(result);
	}
}
