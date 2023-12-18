import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str = reader.readLine()) != null) {
			int debt = 100000;
			int n = Integer.parseInt(str);
			for (int i = 0; i < n; i++) {
				debt *= 1.05;
				if (debt % 1000 != 0) {
					debt -= debt % 1000;
					debt += 1000;
				}
			}
			System.out.println(debt);
		}
		reader.close();
	}
}
