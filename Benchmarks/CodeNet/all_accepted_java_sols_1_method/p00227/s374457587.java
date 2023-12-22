import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m;
		while ((n = in.nextInt()) != 0 && (m = in.nextInt()) != 0) {
			int[] yasai = new int[n];
			for (int i = 0; i < n; i++) {
				yasai[i] = in.nextInt();
			}
			Arrays.sort(yasai);
			int price = 0;
			for (int i = 1; i <= n; i++) {
				if (i % m != 0) {
					price += yasai[n - i];
				}
			}
			System.out.println(price);
		}

	}
}