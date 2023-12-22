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
		int overN = 0;
		int underN = 0;
		boolean[] prims = new boolean[N + 1];

		for (int i = 2; i < N / 2 + 1; i++) {
			if (!prims[i]) {
				for (int j = 2; j < N / i + 1; j++) {
					prims[i * j] = true;
				}
			}
		}
		for (int i = N + 1; ; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				overN = i;
				break;
			}
		}
		for (int i = N; ; i--) {
			if (!prims[i]) {
				underN = i;
				break;
			}
		}

		int primU = 0, primL = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			//U
			if (n >= underN) {
				primU = overN;
			} else {
				for (int i = n + 1; ; i++) {
					if (!prims[i]) {
						primU = i;
						break;
					}
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