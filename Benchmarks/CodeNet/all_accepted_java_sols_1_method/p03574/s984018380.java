import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		String[][] s = new String[h][w];
		int i = 0;
		int j = 0;
		for(i = 0; i < h; i++) {
			String str = scan.next();
			for(j = 0; j < w; j++) {
				s[i][j] = str.charAt(j) + "";
			}
		}
		for(i = 0; i < h; i++) {
			for(j = 0; j < w; j++) {
				if(s[i][j].equals(".")) {
					int count = 0;
					for(int k = -1; k < 2; k++) {
						for(int l = -1; l < 2; l++) {
							if(i == 0 && k == -1) {
								break;
							} else if(j == 0 && l == -1) {
							} else if(j == w - 1 && l == 1) {
							} else if(i == h - 1 && k == 1) {
							} else {
								if(k == 0 && l == 0) {
								} else if(s[i + k][j + l].equals("#")) {
									count++;
								}
							}
						}
					}
					s[i][j] = count + "";
				}
			}
		}
		for(i = 0; i < h; i++) {
			for(j = 0; j < w; j++) {
				System.out.print(s[i][j]);
				if(j == w - 1) {
					System.out.println();
				}
			}
		}
	}
}