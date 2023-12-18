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
		}
	}
	
	public static void printRectangle(int h, int w) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				sb.append('#');
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}