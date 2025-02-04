
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			String[][] s = new String[h][w];

			String tmp = sc.nextLine();
			for (int i = 0; i < h; i++) {
				tmp = sc.nextLine();
				for (int j = 0; j < tmp.length(); j++){
					s[i][j] = String.valueOf(tmp.charAt(j));
				}
			}
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (".".equals(s[i][j])) {
						int count = 0;
						for (int x = i - 1; x <= i + 1; x++) {
							for (int y = j - 1; y <= j + 1; y++) {
								if (0 <= x && x <= h - 1 && 0 <= y && y <= w - 1) {
									if ("#".equals(s[x][y])) {
										count++;
									}
								}
							}
						}
						System.out.print(count);
					} else {
						System.out.print(s[i][j]);
					}
				}
				System.out.println();
			}
		}
	}
}