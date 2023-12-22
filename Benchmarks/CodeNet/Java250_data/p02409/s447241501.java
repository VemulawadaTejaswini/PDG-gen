import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 5;
		int f = 4;
		int r = 11;
		int count[][][] = new int[b][f][r];
		for (int i = 0; i < n; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			count[b][f][r] += sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 11; k++) {
					if (i != 0 && j != 0 && k != 0) {
						System.out.print(" " + count[i][j][k]);
					}
				}
				if (i != 0 && j != 0) {
					System.out.println();
				}
			}
			if (i < 4 && i != 0) {
				System.out.println("####################");
			}
		}
	}
}
