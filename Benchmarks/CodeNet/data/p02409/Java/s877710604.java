import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][][] house = new int[4][3][10];
		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[0].length; j++) {
				for (int k = 0; k < house[0][0].length; k++) {
					house[i][j][k] = 0;
				}

			}
		}

		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		for (int i = 0; i < n; i++) {
			String line2 = sc.nextLine();
			String[] array = line2.split(" ");
			int b = Integer.parseInt(array[0]) - 1;
			int f = Integer.parseInt(array[1]) - 1;
			int r = Integer.parseInt(array[2]) - 1;
			int v = Integer.parseInt(array[3]);

			house[b][f][r] += v;

		}

		for (int i = 0; i < house.length; i++) {
			for (int j = 0; j < house[0].length; j++) {
				for (int k = 0; k < house[0][0].length; k++) {
					System.out.print(" " + house[i][j][k]);
				}
				System.out.println();
			}
			if (i < house.length - 1) {
				System.out.println("####################");

			}
		}

	}

}