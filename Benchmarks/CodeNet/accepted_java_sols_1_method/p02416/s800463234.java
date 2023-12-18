import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		String line;
		int c;
		int sum = 0;
		try {
			while((line = buf.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					c = Integer.parseInt("" + line.charAt(i));
					sum += c;
				}
				if (sum == 0) break;
				output.append(sum).append('\n');
				sum = 0;
			}
			System.out.print(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}