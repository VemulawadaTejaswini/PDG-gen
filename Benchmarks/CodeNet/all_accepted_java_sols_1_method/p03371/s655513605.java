import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(a + b <= 2 * c) {
			System.out.println(a * x + b * y);
		} else {
			int maisuABmax = Math.max(x, y) * 2;
			int maisuABmin = Math.min(x, y) * 2;
			int xx = Math.max(0, x - maisuABmax / 2);
			int yy = Math.max(0, y - maisuABmax / 2);
			int xxx = Math.max(0, x - maisuABmin / 2);
			int yyy = Math.max(0, y - maisuABmin / 2);
			if(maisuABmax * c + a * xx + b * yy <= maisuABmin * c + a * xxx + b * yyy) {
				System.out.println(maisuABmax * c + a * xx + b * yy);
			} else {
				System.out.println(maisuABmin * c + a * xxx + b * yyy);
			}
		}
	}
}
