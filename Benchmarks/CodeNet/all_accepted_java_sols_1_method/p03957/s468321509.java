import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		boolean c = false;
		boolean f = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'C') {
				c = true;
			} else if (s.charAt(i) == 'F' && c) {
				f = true;
			}
		}
		if (f == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
