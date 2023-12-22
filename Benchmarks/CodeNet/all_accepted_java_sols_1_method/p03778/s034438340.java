

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		if (b + w < a) {
			ans = a - b - w;
		} else if (b < a) {
		} else if (b < a + w) {
		} else {
			ans = b - a - w;
		}
		System.out.println(ans);
	}

}
