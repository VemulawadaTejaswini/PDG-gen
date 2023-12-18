import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s_m = "";
		try {
			String n = reader.readLine();
			int nn = Integer.parseInt(n);
			for (int i = 0; i < nn; i++) {
				String s = reader.readLine();
				if (i == 0) {
					s_m = s;
					continue;
				}
				if (s.compareTo(s_m) < 0) {
					s_m = s;
				}
			}
			System.out.println(s_m);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}