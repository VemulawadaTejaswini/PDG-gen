import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0, y = 0, z = 0;
		String ans = "NO";

		x = a % b;
		z = a;
		
		if (x == c) {
			ans = "YES";
		} else {
			while (x != y) {
				z += a;
				y = z % b;
				if (y == c) {
					ans = "YES";
					break;
				}
			}
		}
		
		System.out.println(ans);

		sc.close();
	}
}