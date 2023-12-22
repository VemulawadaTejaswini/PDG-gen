import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			int x, y;
			do {
				String[] list = br.readLine().split(" ");
				x = Integer.parseInt(list[0]);
				y = Integer.parseInt(list[1]);
				if (x == 0 && y == 0) {
					break;
				} else {
					if (x > y) {
						System.out.println(y + " " + x);
					} else {
						System.out.println(x + " " + y);
					}
				}
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}