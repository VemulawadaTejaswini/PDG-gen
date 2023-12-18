import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] c = {
			        in.nextInt(), in.nextInt(), in.nextInt()
			};
			if (c[0] != 0 || c[1] != 0 || c[2] != 0) {
				Arrays.sort(c);
				double d = Math.hypot(c[0], c[1]) / 2;
				int n = in.nextInt();
				for (int i = 0; i < n; i++) {
					if (in.nextInt() > d) {
						System.out.println("OK");
					} else {
						System.out.println("NA");
					}
				}
			}
		}
	}
}