

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int a = scanner.nextInt();
		int x = 0;
		int ans = 0;
		int min = 100000000;
		int res = 0;
		for (int i = 0; i < n; i++) {
			x = scanner.nextInt();
			ans = (t * 1000) - (x * 6) - (a * 1000);
			if(ans < 0) ans = -ans;
			if(ans < min) {
				min = ans;
				res = i;
			}
		}
		
		System.out.println(res + 1);
		scanner.close();

	}

}
