
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt(), w = scanner.nextInt();
		char[][] input = new char[h][w];
		for (int i = 0; i < h; i++) {
			char[] c = scanner.next().toCharArray();
			for (int j = 0; j < c.length; j++) {
				input[i][j] = c[j];
			}
		}
		
		
		char[][] picture = new char[h+2][w+2];
		for (int i = 0; i < h+2; i++) {
			for (int j = 0; j < w+2; j++) {
				picture[i][j] = '#';
			}
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				picture[i+1][j+1] = input[i][j];
			}
		}
		
		

		
		for (int i = 0; i < h+2; i++) {
			String string = new String(picture[i]);
			System.out.println(string);
		}
		
		scanner.close();
	}
}