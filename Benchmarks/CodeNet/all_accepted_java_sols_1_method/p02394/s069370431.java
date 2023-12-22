import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] resultArray = str.split(" ");

		int W = Integer.parseInt(resultArray[0]);
		int H = Integer.parseInt(resultArray[1]);
		int x = Integer.parseInt(resultArray[2]);
		int y = Integer.parseInt(resultArray[3]);
		int r = Integer.parseInt(resultArray[4]);

		if ((x - r < 0) || (W < x + r) || (y - r < 0) || (H < y + r)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}