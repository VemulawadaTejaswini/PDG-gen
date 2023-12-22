import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ")));
				int b = Integer.valueOf(buffer.substring(buffer.indexOf(" ") + 1));
				if (a == b) {
					System.out.println("a == b");
				}
				if (a < b) {
					System.out.println("a < b");
				}
				if (a > b) {
					System.out.println("a > b");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}