import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int count[] = new int[4];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (str.equals("AC")) {
				count[0]++;
			} else if (str.equals("WA")) {
				count[1]++;
			} else if (str.equals("TLE")) {
				count[2]++;
			} else {
				count[3]++;
			}
		}

		for (int i = 0; i < 4; i++) {
			String str = "";

			if (i == 0) {
				str = "AC x ";
			} else if (i == 1) {
				str = "WA x ";
			} else if (i == 2) {
				str = "TLE x ";
			} else if (i == 3) {
				str = "RE x ";
			}
			str += count[i];
			System.out.println(str);
		}
	}
}