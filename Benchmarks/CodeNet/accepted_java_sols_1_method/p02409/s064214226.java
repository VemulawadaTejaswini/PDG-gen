import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.next());
		int[][][] house = new int[4][3][10];
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 10; z++) {
					house[x][y][z] = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			int b = Integer.parseInt(in.next());
			int f = Integer.parseInt(in.next());
			int r = Integer.parseInt(in.next());
			int v = Integer.parseInt(in.next());
			for (int j = 1; j <= 4; j++) {
				if (j == b) {
					for (int k = 1; k <= 3; k++) {
						if (k == f) {
							for (int m = 1; m <= 10; m++) {
								if (m == r) {
									house[j - 1][k - 1][m - 1] += v;
								}
							}
						}
					}
				}
			}
		}
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 10; z++) {
					System.out.print(" " + house[x][y][z]);
				}
				System.out.println("");
			}
			if (x != 3) {
				System.out.println("####################");
			}
		}
	}
}	
