
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int[] a = new int[5];

		int result = 0;
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			result += a[i];
		}

		int[] b = new int[5];
		for (int i = 0; i < a.length; i++) {
			int tmp = 10 - a[i] % 10;
			if (tmp == 10) {
				tmp = 0;
			}
			b[i] = tmp;
		}

		Arrays.sort(b);

		for (int i = 0; i < a.length - 1; i++) {
			result += b[i];
		}

		System.out.println(result);
	}
}
