import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int H,W;

		H = sc.nextInt();
		W = sc.nextInt();

		int table[][] = new int[H+1][W+1];

		for(int row = 0; row < H; row++){
			for(int col = 0; col < W; col++){
				table[row][col] = sc.nextInt();
			}
		}

		for(int row = 0; row < H; row++){
			table[row][W] = 0;
			for(int col = 0; col < W; col++){
				table[row][W] += table[row][col];
			}
		}

		for(int col = 0; col <= W; col++){
			table[H][col] = 0;
			for(int row = 0; row < H; row++){
				table[H][col] += table[row][col];
			}
		}

		for(int row = 0; row <= H; row++){
			System.out.printf("%d", table[row][0]);
			for(int col = 1; col <= W; col++){
				System.out.printf(" %d", table[row][col]);
			}
			System.out.printf("\n");
		}
	}
}


