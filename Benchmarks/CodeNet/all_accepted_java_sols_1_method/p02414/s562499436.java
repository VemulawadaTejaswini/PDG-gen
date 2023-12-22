import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = line.split(" ");
		int[] v = new int[3];
		for (int i = 0; i < v.length; i++) {
			v[i] = Integer.parseInt(k[i]);
		}
		long[][] suuretu = new long[v[0]][v[2]];

		int[][] suuretua = new int[v[0]][v[1]];
		int[][] suuretub = new int[v[1]][v[2]];

		for (int i = 0; i < v[0]; i++) {
			String line2 = sc.nextLine();
			String[] k2 = line2.split(" ");

			for (int j2 = 0; j2 < v[1]; j2++) {
				suuretua[i][j2] = Integer.parseInt(k2[j2]);
			}
		}
		for (int i = 0; i < v[1]; i++) {
			String line2 = sc.nextLine();
			String[] k2 = line2.split(" ");

			for (int j2 = 0; j2 < v[2]; j2++) {
				suuretub[i][j2] = Integer.parseInt(k2[j2]);
			}
		}

		for (int i = 0; i < v[0]; i++) {
			for (int j = 0; j < v[2]; j++) {

				long sum = 0;
				for (int j2 = 0; j2 < v[1]; j2++) {
					sum += suuretua[i][j2]*suuretub[j2][j];
				}suuretu[i][j] = sum;
			}
		}
		for (int i = 0; i < v[0]; i++) {
			for (int j = 0; j < v[2]; j++) {
				System.out.print(suuretu[i][j]);
				if (j!=v[2]-1) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}