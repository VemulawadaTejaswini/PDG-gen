import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());

			int[] x = new int[a];
			for (int j = 0; j < a; j++) {
				x[j] = Integer.parseInt(sc.next());

			}
			int[] y = new int[a - 1];
			for (int j = 0; j < y.length; j++) {
				y[j] = x[j + 1] - x[j];
			}
			Arrays.sort(y);
			if (b > y.length) {
				System.out.println(0);
			} else {
				int sum = 0;
				for (int j = 0; j < y.length - b + 1; j++) {
					sum += y[j];
				}
				System.out.println(sum);
			}
		}
	}
}