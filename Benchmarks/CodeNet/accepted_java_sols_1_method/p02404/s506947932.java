import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			String[] w_h = str.split(" ", 0);
			int h = Integer.parseInt(w_h[0]);
			int w = Integer.parseInt(w_h[1]);
			if (w == 0 && h == 0) {
				break;
			}
			for (int j = 0; j < h; j++) {
				if (j == 0 || j == (h - 1)) {
					for (int i = 0; i < w; i++) {
						System.out.print("#");
					}
				} else {
					for (int i = 0; i < w; i++) {
						if (i == 0 || i == (w - 1)) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}