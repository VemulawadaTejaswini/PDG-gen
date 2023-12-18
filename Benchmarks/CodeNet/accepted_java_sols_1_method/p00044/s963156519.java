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

		int N = 50000;
		int overN;
		boolean[] prims;

		// prim number of over 50000
		for (int i = N + 1; ; i++) {
			if (i % 2 != 0) {
				int count = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					overN = i;
					break;
				} else {
					continue;
				}
			}
		}

		prims = new boolean[overN + 1];
		for (int i = 2; i < overN / 2 + 1; i++) {
			if (!prims[i]) {
				for (int j = 2; j < overN / i + 1; j++) {
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