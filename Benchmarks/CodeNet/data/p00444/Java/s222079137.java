import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int[] conis = new int[]{500, 100, 50, 10, 5, 1};
		int[] charge = new int[1000];
		for (int i = 1; i < charge.length; i++) {
			int k = 1000 - i;
			for (int coin : conis) {
				charge[i] += k / coin;
				k %= coin;
				if (k == 0) {
					break;
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}
			System.out.println(charge[n]);
		}
	}
}