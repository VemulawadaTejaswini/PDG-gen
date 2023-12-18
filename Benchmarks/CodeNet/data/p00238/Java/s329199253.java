import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int goal = Integer.parseInt(line);
			if (goal == 0) {
				break;
			}

			int times = Integer.parseInt(br.readLine());
			int sum = 0;
			for (int i = 0; i < times; i++) {
				line = br.readLine();
				int s = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int f = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				sum += f - s;
			}
			System.out.println(goal - sum > 0 ? goal - sum : "OK");
		}

	}
}