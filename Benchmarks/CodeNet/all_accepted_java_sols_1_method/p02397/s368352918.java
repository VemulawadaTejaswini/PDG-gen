import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			String[] x_y = str.split(" ", 0);
			int x = Integer.parseInt(x_y[0]);
			int y = Integer.parseInt(x_y[1]);
			if (x == 0 && y == 0) {
				break;
			}
			if (x <= y) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
		}
	}
}