import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		double p = 0;
		for (int i = 1; i <= n; i++) {
			int j = i;
			int c = 1;
			while (j < k) {
				j = j << 1;
				c = c << 1;
			}
			p += (1.0 / n) * (1.0 / c);
		}

		System.out.println(p);
	}
}
