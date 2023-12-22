import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//下ごしらえ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] A = new int [n][m];
		int[] b = new int[m];

		//Aの中身をインプット
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		//bの中身をインプット
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}

		//計算の実行
		for(int i=0;i<n;i++) {
			int c=0;
			for(int j=0;j<m;j++) {
				c += (A[i][j]*b[j]);
			}
			System.out.println(c);
		}
	}

}

