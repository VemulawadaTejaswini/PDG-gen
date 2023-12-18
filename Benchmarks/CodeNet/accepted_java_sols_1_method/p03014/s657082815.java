import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.nextLine().toCharArray();
		}

		int[][] l = new int[h][w];
		int[][] r = new int[h][w];
		int[][] t = new int[h][w];
		int[][] b = new int[h][w];
		for (int i = 0; i < h; i++) {
			int count = 0;
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') count = 0;
				else {
					l[i][j] = count++;
				}
			}

			count = 0;
			for (int j = w - 1; j >= 0; j--) {
				if (a[i][j] == '#') count = 0;
				else {
					r[i][j] = count++;
				}
			}
		}

		for (int j = 0; j < w; j++) {
			int count = 0;
			for (int i = 0; i < h; i++) {
				if (a[i][j] == '#') count = 0;
				else t[i][j] = count++;
			}

			count = 0;
			for (int i = h - 1; i >= 0; i--) {
				if (a[i][j] == '#') count = 0;
				else b[i][j] = count++;
			}
		}

		int answer = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				//System.out.print(l[i][j] + r[i][j] + t[i][j] + b[i][j]);
				//System.out.print("  ");
				answer = Math.max(answer, l[i][j] + r[i][j] + t[i][j] + b[i][j] + 1);
			}
			//System.out.println();
		}

		System.out.println(answer);
	}
}
