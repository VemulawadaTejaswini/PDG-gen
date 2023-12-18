import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int[] v = new int[n];
			int[] c = new int[n];
			for (int i = 0; i < n; i++) {
				v[i] = s.nextInt();
			}
			for (int i = 0; i < n; i++) {
				c[i] = s.nextInt();
			}
			int result = 0;
			for (int i = 0; i < n; i++) {
				int d = v[i] - c[i];
				if (d > 0) {
					result += d;
				}
			}
			System.out.println(result);
		}
	}

}