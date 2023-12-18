import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static char[] in = new char[123];
	static char[] out = new char[123];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		initialize();
		int n = 0;
		while ((line = br.readLine()) != null) {
			if (n == 0) {
				if ((n = Integer.parseInt(line)) == 0)
					break;
			} else {
				if (line.contains(" ")) {
					in[line.charAt(0)] = line.charAt(0);
					out[line.charAt(0)] = line.charAt(2);
				} else {
					System.out.print(String.valueOf(out[line.charAt(0)]));
				}
				n--;
				if (n == 0 && line.length() == 1) {
					System.out.println();
					initialize();
				}
			}
		}
	}

	public static void initialize() {
		for (int i = 0; i < 123; i++) {
			in[i] = (char) i;
			out[i] = (char) i;
		}
	}
}