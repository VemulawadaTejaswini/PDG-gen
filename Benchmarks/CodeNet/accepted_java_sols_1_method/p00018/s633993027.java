import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] s = line.split(" ");
				int [] ii = new int[s.length];
				for (int i = 0; i < s.length; i++) {
					ii[i] = Integer.parseInt(s[i]);
				}
				Arrays.sort(ii);
				for (int i = ii.length - 1; i >= 0; i--) {
					System.out.print(ii[i] + ((i != 0) ? " " : ""));
				}
				System.out.println();
			}
		}
	}
}