import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			String[] split = str.split(" ",0);
			int w = Integer.parseInt(split[0]);
			int h = Integer.parseInt(split[1]);
			int x = Integer.parseInt(split[2]);
			int y = Integer.parseInt(split[3]);
			int r = Integer.parseInt(split[4]);

			if ((x - r >= 0) && (x + r <= w) && (y - r >= 0) && (y + r <= h)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		} catch (Exception e) {
			System.out.println("??¨??????");
		}

	}
}