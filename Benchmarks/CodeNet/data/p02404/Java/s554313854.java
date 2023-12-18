import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0 && w == 0) break;
			draw(h, w);
			System.out.println();
		}

	}

	public static void draw(int h, int w) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if(i == 0 || i == h-1)System.out.print("#");
				else if(j == 0 || j == w-1)System.out.print("#");
				else System.out.print(".");
			}
			System.out.println();
		}
	}
}