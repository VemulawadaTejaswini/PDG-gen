import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int x = sc.nextInt();
		sc.close();
		if (isH(x)) {
			System.out.println(x);
			System.exit(0);
		} else {
			for (int i = x - 1; i >= 0; i--) {
				if (isH(i)) {
					a[0] = i;
					break;
				}
			}

			for (int i = x + 1; i < 15000; i++) {
				if (isH(i)) {
					a[1] = i;
					break;
				}
			}
		}
		if ((Math.abs(a[0] - x)) > (Math.abs(a[1] - x))) {
			System.out.println(a[1]);
		} else if ((Math.abs(a[0]) - x) == (Math.abs(a[1]) - x)) {
			System.out.println(min(a[0], a[1]));
		} else {
			System.out.println(a[0]);
		}

	}
	static boolean isH(int x) {
		int sum = 0;
		int a = 0;
		int x1 = x;
		while (x != 0) {
			a = x % 10;
			sum = sum * 10 + a;
			x /= 10;
		}
		if (x1 == sum)
			return true;
		return false;
	}
	static int min(int x, int y) {
		if (x > y)
			return y;
		return x;
	}

}

