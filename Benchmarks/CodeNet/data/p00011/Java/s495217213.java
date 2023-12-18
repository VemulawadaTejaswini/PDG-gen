import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int lots[][];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int n = scan.nextInt();
		lots = new int[n+1][w];
		
		for (int j = 0; j < w; j++) {
			lots[0][j] = j+1;
		}
		
		for (int i = 1; i < n + 1; i++) {
			String num = scan.next();
			int a = num.indexOf(",");
			int p = Integer.parseInt(num.substring(0, a))-1;
			int q = Integer.parseInt(num.substring(a+1, num.length()))-1;
			
			for (int j = 0; j < w; j++) {
				if (j != p && j != q) {
					lots[i][j] = lots[i - 1][j];
				}else {
					lots[i][p] = lots[i - 1][q];
					lots[i][q] = lots[i - 1][p];
				}
			}
			//debug(n);
		}
		
		for (int j = 0; j < w; j++) {
			System.out.println(lots[n][j]);
		}
	}
	
	private void debug(int n) {
		for (int i = 0; i < n+1; i++) {
			System.out.println(Arrays.toString(lots[i]));
		}
		System.out.println();
	}

}