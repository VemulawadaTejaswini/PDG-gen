import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int ansX = 0;
		int ansY = 0;
		int ansH = 0;
		boolean flag = true;
		for (int tmpX = 0; tmpX <= 100; tmpX++) {
			for (int tmpY = 0; tmpY <= 100; tmpY++) {
				int tmpH = 0;
				for (int k = 0; k < n; k++) {
					if (h[k] > 0) {
						tmpH = Math.abs(tmpX - x[k]) + Math.abs(tmpY - y[k]) + h[k];
						break;
					}
				}
				flag = true;
				for (int j = 0; j < n; j++) {
					if (h[j] != Math.max(tmpH - Math.abs(tmpX - x[j]) - Math.abs(tmpY - y[j]), 0)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					ansH = tmpH;
					ansY = tmpY;
					break;
				}
			}
			if (flag) {
				ansX = tmpX;
				break;
			}
		}
		System.out.println(ansX + " " + ansY + " " + ansH);
	}
}
