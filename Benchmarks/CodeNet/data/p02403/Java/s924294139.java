import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 || w == 0) {
				sc.close();
				break;
			}
			printRectangle(h, w);
			System.out.println();
		}
	}
	
	public static void printRectangle(int h, int w) {
		char[] row = new char[w];
		Arrays.fill(row, '#');
		for (int i = 0; i < h; i++) {
			System.out.println(row);
		}
	}
}