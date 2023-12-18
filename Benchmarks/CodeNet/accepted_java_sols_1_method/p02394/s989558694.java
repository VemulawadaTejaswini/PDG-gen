import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] abc = str.split(" ", 0);
		int w = Integer.parseInt(abc[0]);
		int h = Integer.parseInt(abc[1]);
		int x = Integer.parseInt(abc[2]);
		int y = Integer.parseInt(abc[3]);
		int r = Integer.parseInt(abc[4]);

		if (0 <= x && 0 <= y) {
			if (x < w && y < h) {
				if (r <= (w - x) && r <= (h - y)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}
}