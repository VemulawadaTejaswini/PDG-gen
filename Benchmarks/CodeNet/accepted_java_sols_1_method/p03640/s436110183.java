import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		int[][] ans = new int[H][W];
		int i = 0, j = 0;
		for(int c = 0; c < N; c++) {
			// いろ c をぬる
			while(A[c] > 0) {
				ans[i][j] = c + 1;
				A[c]--;
				j += (i % 2 == 0) ? 1 : -1;
				if(j < 0) {
					i++; j = 0;
				}else if(j >= W){
					i++; j = W - 1;
				}
			}
		}
		for(i = 0; i < H; i++) {
			System.out.print(ans[i][0]);
			for(j = 1; j < W; j++) {
				System.out.print(" "+ans[i][j]);
			}
			System.out.println();
		}
	}
}