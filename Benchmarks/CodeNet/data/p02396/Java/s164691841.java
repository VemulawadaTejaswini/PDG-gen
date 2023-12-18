import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				int x = Integer.parseInt(line);
				if (x == 0)
					break;
				System.out.println(x);
			}
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
	}
}