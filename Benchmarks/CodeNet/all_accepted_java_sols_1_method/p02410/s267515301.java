import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[][] A; 
		A = new int[n][m];//行列Aを2次元配列で表す
		int[] B;
		B = new int[m];//ベクトルBは1次元の数列

		for(int a=0;a<n;a++){
			for(int b=0;b<m;b++){
				int c =	scanner.nextInt();
				A[a][b]=c;//行列Aの入力
			}
		}

		for(int a=0;a<m;a++){
			int d =scanner.nextInt();
			B[a]=d;//ベクトルBの入力
		}

		int ci=0;//積ciのための変数

		for(int a=0;a<n;a++){
			ci=0;//計算終了後に初期化
			for(int b=0;b<m;b++){
				ci =ci+( A[a][b]*B[b]);
			}
			System.out.println(ci);

		}
		
		scanner.close();
	}
}

