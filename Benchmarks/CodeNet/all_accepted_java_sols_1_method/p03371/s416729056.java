import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int abprice = A * X + B * Y;

		int target1 = 0;
		int target1_2 = 0;
		int target2 = 0;
		int dif = 0;
		if (X < Y) {
			target1 = X;
			target1_2 = Y;
			target2 = B;
			dif = Y - X;
		} else {
			target1 = Y;
			target1_2 = X;
			target2 = A;
			dif = X - Y;
		}

		int cprice1 = C * target1 * 2 + dif * target2;
		int cprice2 = C * target1_2 * 2;
		int cprice = cprice1 > cprice2 ? cprice2 : cprice1;

		if (abprice > cprice) {
			System.out.println(cprice);
		} else {
			System.out.println(abprice);
		}

	}
}