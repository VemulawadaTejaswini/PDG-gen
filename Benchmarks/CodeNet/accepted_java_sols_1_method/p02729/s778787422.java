import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int m = scn.nextInt();
		int ans1 = 0;
		if (n > 1) {
			ans1 = n * (n - 1) / 2;
		}
		int ans2 = 0;
		if (m > 1) {
			ans2 = m * (m - 1) / 2;
		}
		System.out.println(ans1 + ans2);
	}
}
