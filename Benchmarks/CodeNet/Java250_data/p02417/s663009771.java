import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
					"j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
					"v", "w", "x", "y", "z" };
			int[] alpha_int = new int[26];

			BufferedReader stdReader = new BufferedReader(
					new InputStreamReader(System.in));
			String line;
			while ((line = stdReader.readLine()) != null) {

				int length1 = 0;
				int length2 = 0;


					String s = line;
					length1 = s.length();
					for (int j = 0; j < 26; j++) {
						s = s.toLowerCase();
						s = s.replaceAll(alpha[j], "");
						length2 = s.length();
						alpha_int[j] += length1 - length2;
						s = line;
					}

				

			}
			
			for (int i = 0; i < 26; i++) {
				System.out.print(alpha[i]);
				System.out.print(" : ");
				System.out.println(alpha_int[i]);
			}
			
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}