import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for (;;) {
			int h = in.nextInt();
			int w = in.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}