import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().mainrun();
	}

	private Scanner scan;
	private int H,W;
	private Long[] Ans;
	private int[][] A;
	private void mainrun() {

		scan = new Scanner(System.in);
		H = scan.nextInt();
		W = scan.nextInt();
		
		Ans = new Long[H * W];
		
		A = new int[H][W];
		
		for(int i = 0;i < H;i++) {
			for(int j = 0;j < W;j++) {
				A[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0;i < H;i++) {
			for(int j = 0;j < W;j++) {
				Long ans = (long) 0;
				
				for(int k = 0;k < H;k++) {
					for(int l = 0;l < W;l++) {
						int h = 0,w = 0;
						
						h = Math.abs(k-i) * A[k][l];
						w = Math.abs(l-j) * A[k][l];
						ans += Math.min(h, w);
					}
				}
				
				Ans[W * i + j] = ans;
			}
		}
		
		System.out.println(Arrays.asList(Ans).parallelStream().mapToLong(e->e).min().getAsLong());
		scan.close();
	}
}
