
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] x = new int[3];
		for (int i = 0; i < 3; i++) {
			x[i] = scan.nextInt();
		}
		int bk;
		boolean flg = true;
		while (flg ==true) {
			flg = false;
			for (int i = 1; i < 3; i++) {
				bk = x[i];
				if (x[i - 1] > x[i]) {
					x[i] = x[i - 1];
					x[i - 1] = bk;
					flg = true;
				}
			}
		}
		System.out.printf("%d %d %d\n", x[0], x[1], x[2]);

		scan.close();
	}

}
