import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int k = s.nextInt();
			int x = s.nextInt();
			int y = s.nextInt();
			int ax = k, bx = 0;
			if (n > k) {
				bx = n - k;
			} else {
				ax = n;
			}
			System.out.println(ax * x + bx * y);
		}
	}
}
