import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] charge = new int[1000];
		for (int i = 1; i < charge.length; i++) {
			int k = 1000 - i;
			charge[i] += k / 500;
			k %= 500;
			charge[i] += k / 100;
			k %= 100;
			charge[i] += k / 50;
			k %= 50;
			charge[i] += k / 10;
			k %= 10;
			charge[i] += k / 5;
			k %= 5;
			charge[i] += k;
		}

		br.readLine();
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			System.out.println(charge[n]);
		}
	}
}