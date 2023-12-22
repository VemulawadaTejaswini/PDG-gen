import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = input.readLine();
			String[] list = str.split(" ");
			int a = Integer.parseInt(list[0]);
			int b = Integer.parseInt(list[1]);

			if (a == 0 && b == 0)
				break;

			if (a <= b) {
				sb.append(a + " " + b + "\n");
			} else {
				sb.append(b + " " + a + "\n");
			}

		}
		System.out.print(sb);

	}

}