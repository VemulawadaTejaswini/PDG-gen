import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		char[][] array = new char[H][W];
		int black = 0;
		int[] lineCount = new int[H];
		int[] tateCount = new int[W];
		for(int i = 0; i < H; i++) {
			String line = sc.next();
			for(int j = 0; j < W; j++) {
				char tmp = line.charAt(j);
				array[i][j] = tmp;
				if(array[i][j] == '#') {
					black++;
					lineCount[i]++;
				}
			}
		}
		sc.close();


		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(array[j][i] == '#') {
					tateCount[i]++;
				}
			}
		}

		int count = 0;

		for (int i = 0; i < Math.pow(2, H); i++) {
			for (int j = 0; j < Math.pow(2, W); j++) {
				int check = 0;
				for(int h = 0; h < H; h++) {
					for(int w = 0; w < W; w++) {
						if(((i >> h) & 1) == 0 && ((j >> w) & 1) == 0 && array[h][w] == '#') {
							check++;
						}
					}
				}
				if(check == K) count++;
			}
		}

		System.out.println(count);
	}
}