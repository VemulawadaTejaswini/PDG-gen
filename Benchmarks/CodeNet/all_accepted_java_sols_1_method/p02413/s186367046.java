import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int r = sc.nextInt();
			int c = sc.nextInt();

			int[][] sh = new int[r+1][c+1];

			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					sh[i][j] = sc.nextInt();
					sh[i][c] += sh[i][j];
				}
			}
			for(int i=0;i<=c;i++) {
				for(int j=0;j<r;j++) {
					sh[r][i] += sh[j][i];
				}
			}
			for(int i=0;i<=r;i++) {
				for(int j=0;j<=c;j++) {
					System.out.print(sh[i][j]);
					if(j!=c)
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}

