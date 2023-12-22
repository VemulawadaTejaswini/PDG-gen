import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int cnt = 0;

		while ((line = br.readLine()) != null) {
			String rev = new StringBuffer(line).reverse().toString();
			if (line.equals(rev)) cnt++;
			line = null;
		}

		System.out.println(cnt);

	}

}