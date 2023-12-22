import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			int r, s;
			r = Integer.parseInt(line);
			s = 0;
			for (int i = 1; r * i < 600; i++) {
				s += r * r * r * i * i;
			}
			System.out.println(s);
		}
	}
}