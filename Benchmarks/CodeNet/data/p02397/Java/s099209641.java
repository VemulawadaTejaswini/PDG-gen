import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String input;
			StringBuffer sb = new StringBuffer();

			int count = 1;
			while (true) {
				if (count > 3000) break;

				input = br.readLine();
				String[] inputSplit = input.split(" ");

				int x = Integer.parseInt(inputSplit[0]);
				int y = Integer.parseInt(inputSplit[1]);

				if (!((x >=0 && x <= 10000) && (y >= 0 && x <= 10000))) {
					throw new IllegalArgumentException();
				}

				if (x == 0 && y == 0) break;

				String res = (x < y) ? x + " " + y : y + " " + x;
				sb.append(res);
				sb.append("\n");

				count++;
			}

			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}
	}
}