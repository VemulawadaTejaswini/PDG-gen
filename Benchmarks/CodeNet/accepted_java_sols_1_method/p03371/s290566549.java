import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		int ans = a * x + b * y;

		int tmp1 = 2 * c * x + b * Math.max(y - x, 0);
		if (ans > tmp1) {
			ans = tmp1;
		}

		int tmp2 = 2 * c * y + a * Math.max(x - y, 0);
		if (ans > tmp2) {
			ans = tmp2;
		}

		System.out.println(ans);
	}
}
