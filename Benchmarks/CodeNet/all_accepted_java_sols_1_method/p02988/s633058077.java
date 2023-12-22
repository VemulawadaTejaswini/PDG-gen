
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for (int j = i; j < i + 3; j++) {
				max = Math.max(max, p[j]);
				min = Math.min(min, p[j]);
			}

			if (p[i+1] < max & min < p[i+1]) {
				count++;
			}

		}

		System.out.println(count);




	}

}
