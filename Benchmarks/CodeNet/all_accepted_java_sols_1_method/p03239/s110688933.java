
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int largeT = sc.nextInt();
			int result = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {
				int c = sc.nextInt();
				int t = sc.nextInt();
				if (t <= largeT && c < result) {
					result = c;
				}
			}

			if (result == Integer.MAX_VALUE) {
				System.out.println("TLE");
			} else {
				System.out.println(result);
			}
		}
	}
}
