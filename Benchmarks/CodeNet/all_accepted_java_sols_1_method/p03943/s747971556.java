import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] cut = x.split(" ");
		String h = "No";

		int a = Integer.parseInt(cut[0]);
		int b = Integer.parseInt(cut[1]);
		int c = Integer.parseInt(cut[2]);

		if (a + b == c || a + c == b || b + c == a) {
			h = "Yes";
		}

		System.out.println(h);
	}
}