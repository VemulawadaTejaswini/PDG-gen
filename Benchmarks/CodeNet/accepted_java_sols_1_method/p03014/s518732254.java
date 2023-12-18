import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] field = new char[H][W];

		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				field[i][j] = s.charAt(j);
			}
		}
		sc.close();

		int row[][] = new int[H][W];

		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(j > 0) {
					if(field[i][j] == '.') {
						row[i][j] = row[i][j - 1] + 1;
					}
				}
				else {
					if(field[i][j] == '.') {
						row[i][j] = 1;
					}
				}
			}
			int copy = 0;
			for(int j = W - 1; j >= 0; j--) {
				if(row[i][j] != 0) {
					if(copy == 0){
						copy = row[i][j];
						}
					else {
						row[i][j] = copy;
					}
				}
				else copy = 0;
			}
		}
		
		int col[][] = new int[H][W];

		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(j > 0) {
					if(field[j][i] == '.') {
						col[j][i] = col[j - 1][i] + 1;
					}
				}
				else {
					if(field[j][i] == '.') {
						col[j][i] = 1;
					}
				}
			}
			int copy = 0;
			for(int j = H - 1; j >= 0; j--) {
				if(row[j][i] != 0) {
					if(copy == 0){
						copy = col[j][i];
						}
					else {
						col[j][i] = copy;
					}
				}
				else copy = 0;
			}
		}
		int max = 0;
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				max = Math.max(max, row[i][j] + col[i][j] - 1);
			}
		}

		System.out.println(max);
	}
}