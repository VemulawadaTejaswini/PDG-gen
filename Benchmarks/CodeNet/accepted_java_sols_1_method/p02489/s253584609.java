import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1;; i++) {
			String line = br.readLine();
			if (line.equals("0")) {
				break;
			}
			System.out.println("Case " + i + ": " + line);
		}

	}
}