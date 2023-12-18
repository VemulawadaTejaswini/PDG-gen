import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();

			int count = 1;
			while (count <= 3000) {
				String[] input= br.readLine().split(" ");

				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);

				if (!((x >=0 && x <= 10000) && (y >= 0 && x <= 10000))) {
					throw new IllegalArgumentException();
				}

				if (x == 0 && y == 0) break;

				sb.append(Math.min(x, y) + " " + Math.max(x, y) + "\n");

				count++;
			}

			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}