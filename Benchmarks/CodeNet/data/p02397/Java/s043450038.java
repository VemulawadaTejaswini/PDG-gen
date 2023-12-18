import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int x;
		int y;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			String[] result = str.split(" ");
			x = Integer.parseInt(result[0]);
			y = Integer.parseInt(result[1]);
		
			if (x == 0 && y == 0) {
				break;
			}
			if (y > x) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
		}
	}
}