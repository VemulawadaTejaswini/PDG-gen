import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] c = new int[10][10];
		int[][] A = new int[H][W];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		//わしゃわしゃ
		for(int k = 0; k < 10; k++) {
			for(int i = 0; i < 10; i++) {
				for(int j = 0; j < 10; j++) {
					// i -> j において、kを通ったらどう？
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
				}
			}
		}

		int sum = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(Math.abs(A[i][j]) != 1) {
					sum += c[A[i][j]][1];
				}
			}
		}
		System.out.println(sum);
	}
}