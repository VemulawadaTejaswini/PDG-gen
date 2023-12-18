

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//電車
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//バス
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int ans = Math.min(a, b);
		ans += Math.min(c, d);
		
		System.out.println(ans);
		
		scanner.close();

	}

}
