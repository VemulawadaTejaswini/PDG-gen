import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {


	public static void main(String[] args){

		long startTime = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		//Main player = new Main();

		final int H = Integer.parseInt(sc.next());
		final int W = Integer.parseInt(sc.next());
		int[][] A = new int[H][W];
		int[][] B = new int[H][W];
		boolean[][][] DP = new boolean[H+1][W+1][25601];

		for (int h=0; h<H; h++){
			for (int w=0; w<W; w++){
				A[h][w] = Integer.parseInt(sc.next());
			}
		}
		for (int h=0; h<H; h++){
			for (int w=0; w<W; w++){
				B[h][w] = Integer.parseInt(sc.next());
			}
		}

		for (int h=0; h<H+1; h++){
			for (int w=0; w<W+1; w++){
				for (int i=0; i<25601; i++){
					DP[h][w][i] = false;
				}
			}
		}
		DP[0][0][12800] = true;

		for (int h=0; h<H; h++){
			for (int w=0; w<W; w++){
				int d = A[h][w] - B[h][w];
				for (int i=0; i<25601; i++){
					if (DP[h][w][i]){
						DP[h+1][w][i+d] = true;
						DP[h+1][w][i-d] = true;
						DP[h][w+1][i+d] = true;
						DP[h][w+1][i-d] = true;
					}
				}
			}
		}
		for (int i=0; i<12801; i++){
			if (DP[H][W-1][12800+i] || DP[H][W-1][12800-i]){
				System.out.println(i);
				break;
			}
		}
	}
}
