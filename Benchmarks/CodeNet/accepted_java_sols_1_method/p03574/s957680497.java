import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String[][] map = new String[H + 2][W + 2];
		String[][] answer = new String[H + 2][W + 2];
		for(int j = 0; j < W + 2; j++) {
			map[0][j] = ".";
		}
		
		for(int i = 1; i <= H; i++) {
			String S = sc.next();
			map[i][0] = ".";
			for(int j = 1; j <= W; j++) {
				map[i][j] = S.split("")[j - 1];
			}
			map[i][W + 1] = ".";
		}
		
		for(int j = 0; j < W + 2; j++) {
			map[H + 1][j] = ".";
		}
		sc.close();

		for(int i = 1; i <= H; i++) {
			int h = i;
			for(int j = 1; j <= W; j++) {
				int w = j;
				int count = 0;
				if(map[h - 1][w - 1].equals("#")) {
					count++;
				}
				if(map[h - 1][w].equals("#")) {
					count++;
				}
				if(map[h - 1][w + 1].equals("#")) {
					count++;
				}
				if(map[h][w - 1].equals("#")) {
					count++;
				}
				if(map[h][w].equals("#")) {
					answer[h][w] = "#";
					continue;
				}
				if(map[h][w + 1].equals("#")) {
					count++;
				}
				if(map[h + 1][w - 1].equals("#")) {
					count++;
				}
				if(map[h + 1][w].equals("#")) {
					count++;
				}
				if(map[h + 1][w + 1].equals("#")) {
					count++;
				}
				answer[h][w] = String.valueOf(count);
			}
		}


		for(int i = 1; i <= H; i++) {
			for(int j = 1; j <= W; j++) {
				if(j == W) {
					System.out.println(answer[i][j]);
				}else {
					System.out.print(answer[i][j]);
				}
			}
		}

	}

}