import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int width, length;
		int a[][];

		length = sc.nextInt();
		width = sc.nextInt();
		while (width + length != 0) {
			a = new int[length][width];
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < width; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println(f(a, width, length, 0));
			length = sc.nextInt();
			width = sc.nextInt();
		}
	}

	public static int f(int a[][], int width, int length, int k) {
		int line, sum = 0;
		int max = 0;
		int change;

		if (length <= k) {
			for (int i = 0; i < width; i++) {
				line = 0;
				for (int j = 0; j < length; j++) {
					line += a[j][i];
				}
				sum += Math.max(line, length - line);
			}
			return sum;
		}

		for (int i = 0; i < width; i++) {
			a[k][i] = (a[k][i] + 1) % 2;
		}
		change = f(a, width, length, k + 1);
		for (int i = 0; i < width; i++) {
			a[k][i] = (a[k][i] + 1) % 2;
		}
		max = Math.max(change, f(a, width, length, k + 1));
		return max;
	}
}