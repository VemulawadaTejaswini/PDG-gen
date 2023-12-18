import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int R = in.nextInt();
			int C = in.nextInt();
			if (R == 0 && C == 0) {
				break;
			}
			boolean[][] a = new boolean[R][C];
			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					a[i][j] = (in.nextInt() == 1);
				}
			}
			
			int max = 0;
			for (int b = 0; b < (1 << R); b++) {
				boolean[] turn = new boolean[R];
				for (int i = 0; i < R; i++) {
					turn[i] = ((b & (1 << i)) != 0);
				}
				int sum = 0;
				for (int j = 0; j < C; j++) {
					int k = 0;
					for (int i = 0; i < R; i++) {
						if (a[i][j] ^ turn[i]) {
							k++;
						}
					}
					sum += Math.max(k, R - k);
				}
				if (sum > max) {
					max = sum;
				}
			}
			
			System.out.println(max);
		}
	}
}