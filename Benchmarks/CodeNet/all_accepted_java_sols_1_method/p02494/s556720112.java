import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int h = in.nextInt();
			int w = in.nextInt();
			if (h == 0 && w == 0)
				break;
			for (int i = 0; i < h; ++i) {
				for (int j = 0; j < w; ++j) {
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}