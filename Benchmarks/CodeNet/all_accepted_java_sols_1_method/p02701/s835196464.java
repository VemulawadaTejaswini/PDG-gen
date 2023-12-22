import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());

		String[] s = new String[n];
		for (int i = 0; i < n; ++i) {
			s[i] = r.readLine();
		}

		long c = Arrays.stream(s).distinct().count();
		System.out.println(c);

		r.close();
	}
}