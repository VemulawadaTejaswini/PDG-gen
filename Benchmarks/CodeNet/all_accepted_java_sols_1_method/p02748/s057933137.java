import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int a_num = scanner.nextInt();
		final int b_num = scanner.nextInt();
		final int m = scanner.nextInt();
		int[] a = new int[a_num];
		int[] b = new int[b_num];

		int a_min = 100000;
		int b_min = 100000;
		for (int i = 0; i < a_num; i++) {
			a[i] = scanner.nextInt();
			if (a[i] < a_min)
				a_min = a[i];
		}
		for (int i = 0; i < b_num; i++) {
			b[i] = scanner.nextInt();
			if (b[i] < b_min)
				b_min = b[i];
		}

		int result = a_min + b_min;

		for (int i = 0, x, y, c, value; i < m; i++) {
			x = scanner.nextInt()-1;
			y = scanner.nextInt()-1;
			c = scanner.nextInt();
			value = a[x] + b[y] - c;
			if (value < result)
				result = value;
		}
		System.out.println(result);
	}

}
