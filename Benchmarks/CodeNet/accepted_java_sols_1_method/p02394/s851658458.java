import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String[] strAry = str.split(" ");
		int[] intAry = new int[5];

		int w = Integer.parseInt(strAry[0]);
		int h = Integer.parseInt(strAry[1]);
		int x = Integer.parseInt(strAry[2]);
		int y = Integer.parseInt(strAry[3]);
		int r = Integer.parseInt(strAry[4]);

		if( x-r >= 0 && y-r >= 0 && x+r <= w && y+r <= h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}