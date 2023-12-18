import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String...args) throws IOException {

		String line = null;

		do {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			line = br.readLine();
			String[] values = line.split(" ");
			if (values.length == 2) {
				int a = Integer.parseInt(values[0]);
				int b = Integer.parseInt(values[1]);
				System.out.println(a + b);
			}
		} while (line != null && !"".equals(line));
		return;
	}
}

