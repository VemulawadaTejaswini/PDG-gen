import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		int x = 0;
		int y = 0;

		for (int i = 0; i < v.length; i++) {
			v[i] = sc.nextInt();
		}

		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (v[i] > c[i]) {
				x += v[i];
				y += c[i];
			}
		}

		System.out.println(x - y);

	}

}
