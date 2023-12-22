import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ")));
				Integer b = Integer.valueOf(buffer.substring(buffer.indexOf(" ") + 1, buffer.indexOf(" ", buffer.indexOf(" ") + 1)));
				Integer c = Integer.valueOf(buffer.substring(buffer.indexOf(" ", buffer.indexOf(" ") + 1) + 1));
				if (a < b && b < c) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}