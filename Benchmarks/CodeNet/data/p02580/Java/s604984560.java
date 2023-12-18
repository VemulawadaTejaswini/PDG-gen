import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		int bak[][] = new int[H][W];

		for(int i=0; i<H; i++)
			for(int j =0; j<W; j++)
				bak[i][j] = 0;

		for(int i =0; i<M; i++) {
			int x = sc.nextInt()-1 ;
			int y = sc.nextInt()-1 ;
			bak[x][y] = 1;
		}

		int xline = 0, xmax = 0;

		for(int i=0; i< H; i++) {
			int tmp = 0;
			for(int j = 0; j<W; j ++) {
				tmp += bak[i][j];
			}
			if(xmax<tmp) {
				xmax =tmp;
				xline = i;
			}
		}

		int yline= 0, ymax = 0;

		for(int i=0; i< W; i++) {
			int tmp = 0;
			for(int j = 0; j<H; j ++) {
				tmp += bak[j][i];
			}
			if(ymax<tmp || (ymax <= tmp && bak[xline][i]==0)) {
				ymax =tmp;
				yline = i;
			}
		}

		int ans = 0;

		if(bak[xline][yline]==0) {
			ans = xmax + ymax;
		}else {
			ans = xmax + ymax -1;
		}

		System.out.println(ans);
		sc.close();
	}
}
