import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		int count = 0;
		try {
			while ((buffer = reader.readLine())  != null) {
				int i = Integer.valueOf(buffer);
				if (i == 0) {
					return;
				}
				System.out.print("Case " + ++count + ": " + i);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}