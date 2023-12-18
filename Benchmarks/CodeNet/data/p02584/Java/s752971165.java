import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long can; 
		if ((x / d) > k) {
			can = k;
		} else {
			can = x / d;
		}
		if (x < 0) {
			k = k - can;
			x = x + (d * can);
		} else {
			k = k - can;
			x = x - (d * can);
		}
		k = k - ((k / 2) * 2);
		while (k > 0) {
			if (x < 0) {
				x = x + d;
			} else {
				x = x - d;
			}
			k--;
		}
		if (x < 0) {
			System.out.println(0 - x);
		} else {
			System.out.println(x);
		}
	}
}