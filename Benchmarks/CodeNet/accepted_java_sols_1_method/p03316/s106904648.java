import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String nstr = br.readLine();
		int n = Integer.parseInt(nstr);

		int sn = 0;

		for (int i = 0; i < nstr.length(); i++) {
			sn += nstr.charAt(i) - '0';
		}

		if (n % sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
