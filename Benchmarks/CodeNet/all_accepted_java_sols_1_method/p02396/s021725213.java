import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i = 1;
		try {
			while ((line = reader.readLine()) != null) {
				if (line.equals("0"))
					break;
				System.out.println("Case " + i + ": " + line);
				i++;
			}
		} catch (IOException e) {
		}
	}
}