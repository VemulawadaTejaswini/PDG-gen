import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int R = scan.nextInt();
			int C = scan.nextInt();
			if (R == 0 && C == 0) {
				scan.close();
				break;
			}
			int a[][] = new int[R][C];
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					a[i][j] = scan.nextInt();
				}
			}
			System.out.println(maxSenbei(a, 0, 0, 1));
		}
	}

	private static int maxSenbei(int[][] a, int row, int reverse, int curBit) {
		if (row == a.length) {
			int senbei = 0;
			for (int j = 0; j < a[0].length; j++) {
				int r = reverse;
				int sumZero = 0;
				for (int i = a.length - 1; i >= 0; i--) {
					if ((r & 1) == 1) {
						if (a[i][j] == 1) sumZero++;
					} else {
						if (a[i][j] == 0) sumZero++;						
					}
					r >>= 1;
				}
				if (sumZero <= a.length / 2) sumZero = a.length - sumZero;
				senbei += sumZero;
			}
			return senbei;
		}
		int max1 = maxSenbei(a, row + 1, reverse, curBit << 1);
		int max2 = maxSenbei(a, row + 1, reverse | curBit, curBit << 1);
		return (max1 > max2) ? max1 : max2;
	}

}

