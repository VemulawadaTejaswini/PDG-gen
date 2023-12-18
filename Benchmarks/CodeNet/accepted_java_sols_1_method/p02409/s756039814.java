import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = new int[n];
		int[] f = new int[n];
		int[] r = new int[n];
		int[] v = new int[n];

		int[][][] num = new int[4][3][10];

		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
			f[i] = scan.nextInt();
			r[i] = scan.nextInt();
			v[i] = scan.nextInt();

			num[b[i] - 1][f[i] - 1][r[i] - 1] += v[i];
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				String str = "";
				for (int k = 0; k < 10; k++) {
					str += " " + num[i][j][k]; 
				}
				System.out.println(str);
			}
			if (i != 3) {
				System.out.println("####################");
			}
		}

		scan.close();
	}

}