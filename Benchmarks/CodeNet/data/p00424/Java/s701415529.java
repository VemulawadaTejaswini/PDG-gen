import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n = 0;
		String[] in = new String[123];
		String[] out = new String[123];

		while ((line = br.readLine()) != null) {
			if (n == 0) {
				if ((n = Integer.parseInt(line)) == 0)
					break;
			} else {
				if (line.contains(" ")) {
					in[line.charAt(0)] = line.substring(0, 1);
					out[line.charAt(0)] = line.substring(2);
				} else {
					if (in[line.charAt(0)] != null)
						System.out.print(out[line.charAt(0)]);
					else
						System.out.print(line);
				}
				n--;
				if (n == 0 && line.length() == 1) {
					System.out.println();
					in = new String[123];
					out = new String[123];
				}
			}
		}
	}
}