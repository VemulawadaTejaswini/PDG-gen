

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();
		int first = l;
		int last = l + n - 1;
		int sum = n * l + n * (n + 1) / 2 - n;
		int ans = sum;

		if (first > 0) {
			ans -= first;
		} else if (last < 0) {
			ans -= last;
		}

		System.out.println(ans);

	}

}
