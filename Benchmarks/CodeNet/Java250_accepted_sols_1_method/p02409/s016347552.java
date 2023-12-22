import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int dartenc = Integer.parseInt(line);
		String[] k = new String[dartenc];
		int[][][] darten = new int[4][3][10];

		for (int i = 0; i < darten.length; i++) {
			for (int j = 0; j < darten[1].length; j++) {
				for (int j2 = 0; j2 < darten[0].length; j2++) {
					darten[i][j][j2] = 0;
				}
			}
		}
		for (int i = 0; i < k.length; i++) {
			k[i] = sc.nextLine();
			String[] v = k[i].split(" ");
			int[] a = new int[4];
			for (int j = 0; j < a.length; j++) {
				a[j] = Integer.parseInt(v[j]);
			}
			darten[a[0] - 1][a[1] - 1][a[2] - 1] += a[3];// ?????¢...b?£?f??????r?????????????????§??\???

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					System.out.print(" "+darten[i][j][j2]);
				}
				System.out.println("");
				
			}if (i!=3) {
				System.out.println("####################");
			
			}
			
		}

	}

}