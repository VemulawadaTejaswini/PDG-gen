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
			int len = str.length();
			char[] r = new char[len];
			for (int i = 0; i < len / 2; i++) {
				r[len-i-1] = str.charAt(i);
				r[i] = str.charAt(len-i-1);
			}
			System.out.println(r);
		}
		reader.close();
	}
}

