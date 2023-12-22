import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = null;
		String p = null;

		try {
			s = br.readLine();
			p = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		s = s + s + s;

		if (s.indexOf(p) != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}