import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
				int r = sc.nextInt();
				int c = sc.nextInt();

				int[][] table = new int[r][c];

				//読み込む
				for (int i=0; i<r; i++) {
					for (int j=0; j<c; j++) {
						table[i][j] = sc.nextInt();
					}
				}

				for (int i=0; i<r; i++) {
					int total = 0;
					for (int j=0; j<c; j++) {
						total += table[i][j];
						System.out.print(table[i][j] + " ");
					}
					System.out.println(total);
				}
				
				int t = 0;
				for (int i=0; i<c; i++) {
					int total = 0;
					for (int j=0; j<r; j++) {
						total += table[j][i];
					}
					System.out.print(total + " ");
					t += total;
				}
				System.out.println(t);
		}
	}

}
