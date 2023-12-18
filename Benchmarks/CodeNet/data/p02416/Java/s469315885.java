import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while ((line = reader.readLine()) == "0") {
				int sum = 0;
				for (int i = 0; i < line.length(); i++) {
					sum += line.charAt(i) - '0';
				}
				System.out.println(sum);
			}
		} catch (IOException e) {
		}
	}
}