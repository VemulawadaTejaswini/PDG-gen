import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int i = 0;
		try {
			while ((buffer = reader.readLine())  != null) {
				int x = Integer.valueOf(buffer);
				if (x == 0) {
					return;
				}
				System.out.println("Case " + ++i + ": " + x);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}