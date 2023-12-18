import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String line;
		try {
			while (!(line = reader.readLine()).equals("0")) {
				int sum = 0;
				for (int i = 0; i < line.length(); ++i)
					sum += Character.digit(line.charAt(i), 10);
				out.append(sum + "\n");
			}
			System.out.print(out);
		} catch (Exception e) {
		}
	}
}
