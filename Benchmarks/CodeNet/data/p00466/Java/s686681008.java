import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		StringBuilder sb = new StringBuilder();
		while (!(line = br.readLine()).equals("0")) {

			int total = Integer.parseInt(line);
			for (int i = 0; i < 9; i++) {
				total -= Integer.parseInt(br.readLine());
			}
			sb.append(total + "\n");
		}
		System.out.print(sb.toString());
	}
}