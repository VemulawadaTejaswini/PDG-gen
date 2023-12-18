import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				int a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				String op = buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" "));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				int b = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));

				switch (op) {
				default : {
					return;
				}
				case ("+") : {
					System.out.println((int)(a + b));
					break;
				}
				case ("-") : {
					System.out.println((int)(a - b));
					break;
				}
				case ("*") : {
					System.out.println((int)(a * b));
					break;
				}
				case ("/") : {
					System.out.println((int)(a / b));
					break;
				}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}