import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= Math.max(x, y); i++) {
			int temp = c * 2 * i + a * Math.max(x - i, 0) + b * Math.max(y - i, 0);
			if (temp < ans) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}
}