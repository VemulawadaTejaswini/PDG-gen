
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[])  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		boolean end = false;

		while (!end) {
			String temp = br.readLine();
			String[] numbers = temp.split(" ");
			x = Integer.parseInt(numbers[0]);
			y = Integer.parseInt(numbers[1]);

			if (x == 0 && y == 0) {
				end = true;
			} else if (x >= y) {
				System.out.println(y + " " + x);
			} else if (x < y) {
				System.out.println(x + " " + y);
			} else {
				// ???????????????????????????????????\???????????????
			}
		}
	}
}