import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		while (true) {
			String[] array = br.readLine().split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[2]);

			if ("?".equals(array[1])) {
				break;
			}
			if ("+".equals(array[1])) {
				sb.append((a + b)).append("\n");
			} else if ("-".equals(array[1])) {
				sb.append((a-b)).append("\n");
			} else if ("*".equals(array[1])) {
				sb.append((a*b)).append("\n");
			} else if ("/".equals(array[1])) {
				sb.append((a/b)).append("\n");
			}
		}

		System.out.print(sb.toString());
	}
}