import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		
		boolean[][] squares = new boolean[H][W];
		for(int i = 0; i < H; i++) {
			String row = sc.next();
			for(int j = 0; j< W; j++) {
				squares[i][j] = row.charAt(j) == '#';
			}
		}
		int chooseWay = 0;
		for(int maskR = 0; maskR < (1<<H) - 1;maskR++) {
			for(int maskC = 0; maskC < (1<<W) - 1; maskC++) {
				int blackNum = 0;
				for(int i = 0; i < H; i++) {
					for(int j = 0; j < W; j++) {
						if((maskR & 1<<i) == 0 && (maskC & 1<<j) == 0 && squares[i][j]) {
							blackNum++;
						}
					}
				}
				if(blackNum == K) {
					chooseWay++;
				}
			}
		}
		System.out.println(chooseWay);
	}

}
