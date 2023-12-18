import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = 1;
		int ans = 0;
		while (true) {
			if (x % d == 0 && y % d == 0) {
				ans = d;
			} else if (d > x && d > y) {
				break;
			}
		}
		System.out.println(ans);
	}
}

