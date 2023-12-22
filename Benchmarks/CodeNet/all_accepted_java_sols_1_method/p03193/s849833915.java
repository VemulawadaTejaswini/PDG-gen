import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int hh = sc.nextInt(), ww = sc.nextInt();
			if (h <= hh && w <= ww) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}