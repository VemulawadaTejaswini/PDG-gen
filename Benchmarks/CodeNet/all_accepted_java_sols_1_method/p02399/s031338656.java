import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				Integer a = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer b = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				buffer = buffer.substring(buffer.indexOf(" ") + 1);
				Integer c = Integer.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				int d = a / b;
				int r = a - b * d;
				double f = (double)a / b;
				System.out.println(d + " " + r + " " + BigDecimal.valueOf(f).toPlainString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}