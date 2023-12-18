import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int H = scn.nextInt();
		int W = scn.nextInt();
		scn.nextLine();
		int[][] block = new int[H][W];

		int[][] yoko = new int[H][W];
		int[][] tate = new int[H][W];

		for (int i = 0; i < H; i++) {
			char[] ch = scn.nextLine().toCharArray();
			for (int j = 0; j < W; j++) {
				block[i][j] = (ch[j] == '#') ? 0 : 1;
			}
		}

		for (int h = 0; h < H; h++) {
			int count = 0;
			for(int w = 0;w < W;w++) {
				if(block[h][w] == 0) {
					count = 0;
					yoko[h][w] = -1;
				}else {
					count++;
					yoko[h][w] = count;
				}
			}
			count = 0;
			for(int w = W-1;w >= 0;w--) {
				if(yoko[h][w] == -1) {
					count = 0;
				}else {
					count = Math.max(yoko[h][w],count);
					yoko[h][w] = count;
				}
			}
		}

		for (int w = 0; w < W; w++) {
			int count = 0;
			for(int h = 0;h < H;h++) {
				if(block[h][w] == 0) {
					count = 0;
					tate[h][w] = -1;
				}else {
					count++;
					tate[h][w] = count;
				}
			}
			count = 0;
			for(int h = H-1;h >= 0;h--) {
				if(tate[h][w] == -1) {
					count = 0;
				}else {
					count = Math.max(tate[h][w],count);
					tate[h][w] = count;
				}
			}
		}


		long ans = 0;
		for (int h = 0; h < H; h++) {

			for (int w = 0; w < W; w++) {
				if (block[h][w] == 0)
					continue;

				ans = Math.max(ans, yoko[h][w] + tate[h][w] - 1);

			}
		}

		System.out.println(ans);
	}


}
