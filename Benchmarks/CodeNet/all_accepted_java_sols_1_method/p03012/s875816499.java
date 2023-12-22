
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}

			int left = 0;
			int right = sum;
			int min = sum;
			for (int i = 0; i < n; i++) {
				left += s[i];
				right -= s[i];
				if (Math.abs(left - right) < min) {
					min = Math.abs(left - right);
				}
			}
			System.out.println(min);
		}
	}
}
