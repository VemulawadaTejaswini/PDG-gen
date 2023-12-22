

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		long ans = 0;

		while(x >=500) {
		x = x - 500;
		ans += 1000;
		}
		while(x >= 5) {
			x = x - 5;
			ans += 5;
		}

		System.out.println(ans);


		sc.close();

	}

}
