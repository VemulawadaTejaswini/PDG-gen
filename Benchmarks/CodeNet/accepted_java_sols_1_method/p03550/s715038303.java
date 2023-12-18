import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int w = sc.nextInt();
		int beforeLastNum = 0, LastNum = 0;
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			if (i == n - 1)
				beforeLastNum = a;
			else if (i == n)
				LastNum = a;
		}
		if (n == 1) {
			System.out.println(Math.abs(w - LastNum));
		} else {
			System.out.println(Math.max(Math.abs(LastNum-w), Math.abs(LastNum - beforeLastNum)));
		}
	}
}