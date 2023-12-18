import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int i = 0;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer x = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer y = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
			if (x == 0 && y == 0) return;
			if (x < y) {
				System.out.println(x + " " + y);
			}
			else {
				System.out.println(y + " " + x);
			}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}