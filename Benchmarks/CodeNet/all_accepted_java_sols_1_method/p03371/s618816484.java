import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		scan.close();
		long ans = 0;
		int res = 0;
		if(A + B <= 2 * C) {
			ans = A * X + B * Y;
			System.out.println(ans);
			System.exit(0);
		}else {
			if(X - Y >= 0) {
				ans += 2 * C * Y;
				res = X - Y;
				if(A > 2 * C) {
					ans += 2 * C * res;
				}else {
					ans += A * res;
				}
			}else {
				ans += 2 * C * X;
				res = Y - X;
				if(B > 2 * C) {
					ans += 2 * C * res;
				}else {
					ans += B * res;
				}
			}
		}
		System.out.println(ans);

	}
}