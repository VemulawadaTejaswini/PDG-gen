import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][][] data = new int[3][4][10];

		for(int i = 0; i < n; i++) {
			int b = scan.nextInt() - 1;
			int f = scan.nextInt() - 1;
			int r = scan.nextInt() - 1;
			int v = scan.nextInt() - 1;

			data[b][f][r] += v;
		}

		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					if(k != 0) {
						System.out.printf(" ");
					}
					System.out.printf("%d", data[i][j][k]);
				}
				System.out.println();
			}
			System.out.println("####################");
		}

		scan.close();
	}
}
