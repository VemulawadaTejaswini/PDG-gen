import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		while (true) {
			String input = br.readLine();
			if ("0".equals(input)) {
				break;
			}
			int sum = 0;
			for (int i =0; i < input.length(); i++) {
				sum += Integer.parseInt(input.substring(i, i+1));
			}
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());
	}
}