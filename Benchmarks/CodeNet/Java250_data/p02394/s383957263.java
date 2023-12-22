import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String[] strs = br.readLine().split(" ");
			int w = Integer.parseInt(strs[0]);
			int h = Integer.parseInt(strs[1]);
			int x = Integer.parseInt(strs[2]);
			int y = Integer.parseInt(strs[3]);
			int r = Integer.parseInt(strs[4]);

			if ((0 > (x - r)) || (0 > (y - r))) {
				// x??? or y??? ???????????????????¶????
				System.out.println("No");
			} else if ((w < (x + r)) || (h < (y + r))) {
				// x??? or y??? ????????????????¶????
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}