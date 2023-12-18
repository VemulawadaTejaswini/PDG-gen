import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]d = new int[6];
		for(int i = 0; i < 6; i++) {
			d[i] = scan.nextInt();
		}
		int[]e = new int[6];
		for(int i = 0; i < 6; i++) {
			e[i] = scan.nextInt();
		}
		int[]d0 = {d[0], d[1], d[2], d[3], d[4], d[5]};
		int[]d1 = {d[1], d[5], d[2], d[3], d[0], d[4]};
		int[]d2 = {d[2], d[0], d[1], d[4], d[5], d[3]};
		int[]d3 = {d[3], d[0], d[4], d[1], d[5], d[2]};
		int[]d4 = {d[4], d[0], d[2], d[3], d[5], d[1]};
		int[]d5 = {d[5], d[1], d[3], d[2], d[4], d[0]};
		scan.close();
		int[][]D = new int[24][6];
		for(int i = 0; i < 6; i++) {
			D[0][i] = d0[i];
			D[4][i] = d1[i];
			D[8][i] = d2[i];
			D[12][i] = d3[i];
			D[16][i] = d4[i];
			D[20][i] = d5[i];
		}

		for(int i = 0; i < 3; i++) {
			int[]k0 = rot(D[i]);
			int[]k1 = rot(D[i + 4]);
			int[]k2 = rot(D[i + 8]);
			int[]k3 = rot(D[i + 12]);
			int[]k4 = rot(D[i + 16]);
			int[]k5 = rot(D[i + 20]);

			for(int j = 0; j < 6; j++) {
				D[i + 1][j] = k0[j];
				D[i + 5][j] = k1[j];
				D[i + 9][j] = k2[j];
				D[i + 13][j] = k3[j];
				D[i + 17][j] = k4[j];
				D[i + 21][j] = k5[j];
			}
		}
//		for(int i = 0; i < 24; i++) {
//			for(int j = 0; j < 6; j++) {
//				System.out.print(D[i][j] + " ");
//			}
//			System.out.println();
//		}

		for(int i = 0; i < 24; i++) {
			boolean flag = true;
			for(int j = 0; j < 6; j++) {
				if(D[i][j] != e[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
	static int[] rot(int[] d) {
		int []t = new int[6];
		int []d1 = new int[6];
		for(int j = 0; j < 6; j++) {
			t[j] = d[j];
			d1[j] = d[j];
		}
		d1[1] = t[3];
		d1[2] = t[1];
		d1[3] = t[4];
		d1[4] = t[2];
		return d1;
	}
	static void disp(int[] d) {
		for(int i : d) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
