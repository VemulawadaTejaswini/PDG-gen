import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		try {
			while (!(line = br.readLine()).equals("0") && !line.isEmpty()) {

				int goal = Integer.parseInt(line);
				int times = Integer.parseInt(br.readLine());
				int sum = 0;
				for (int i = 0; i < times; i++) {
					line = br.readLine();
					int s = Integer.parseInt(line.substring(0,
							line.indexOf(' ')));
					int f = Integer
							.parseInt(line.substring(line.indexOf(' ') + 1));
					sum += f - s;
				}
				System.out.println(sum > goal ? "OK" : goal - sum);
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}