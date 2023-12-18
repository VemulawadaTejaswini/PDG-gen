import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int out = 0, score = 0;
			boolean first = false, second = false, third = false;
			while (out != 3) {
				String res = br.readLine();
				if (res.equals("OUT"))
					out++;
				else if (res.equals("HOMERUN")) {
					score++;
					if (first) score++;
					if (second) score++;
					if (third) score++;
					first = second = third = false;
				} else {
					if (third) score++;
					third = second;
					second = first;
					first = true;
				}
			}
			System.out.println(score);
		}

	}

}