import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Prime Number II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int N = 50021;
		boolean[] prims = new boolean[N + 1];

		prims = new boolean[N + 1];
		for (int i = 2; i < N / 2 + 1; i++) {
			if (!prims[i]) {
				for (int j = 2; j < N / i + 1; j++) {
					prims[i * j] = true;
				}
			}
		}

		int primU = 0, primL = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			//U
			for (int i = n + 1; ; i++) {
				if (!prims[i]) {
					primU = i;
					break;
				}
			}
			//L
			for (int i = n - 1; ; i--) {
				if (!prims[i]) {
					primL = i;
					break;
				}
			}
			System.out.println(primL + " " + primU);
		}
	}
}