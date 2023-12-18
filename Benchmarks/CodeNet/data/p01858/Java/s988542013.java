import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sendame
 */
public class Main {

	static final String Kougekida = "kougekida";
	static final String Tameru = "tameru";
	static final String Mamoru = "mamoru";

	static enum Winner {
		None,
		Isono,
		Nakajima,
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int K = parseInt(br.readLine());

		String[] I = new String[K];
		String[] N = new String[K];
		int pI = 0;
		int pN = 0;

		for (int i = 0; i < K; i++) {
			I[i] = br.readLine();
		}

		for (int i = 0; i < K; i++) {
			N[i] = br.readLine();
		}

		//

		Winner winner = Winner.None;

		for (int i = 0; i < K; i++) {

			switch (I[i]) {
				case Kougekida:
					switch (N[i]) {
						case Kougekida:
							if (pI > pN) winner = Winner.Isono;
							if (pI < pN) winner = Winner.Nakajima;
							pI = pN = 0;
							break;
						case Tameru:
							if (pI == 0) {
								winner = Winner.Nakajima;
							} else {
								winner = Winner.Isono;
							}
							if (pN < 5) pN++;
							pI = 0;
							break;
						case Mamoru:
							if (pI == 0) {
								winner = Winner.Nakajima;
							} else if (pI == 5) {
								winner = Winner.Isono;
							}
							pI = 0;
							break;
					}
					break;
				case Tameru:
					switch (N[i]) {
						case Kougekida:
							if (pN == 0) {
								winner = Winner.Isono;
							} else {
								winner = Winner.Nakajima;
							}
							if (pI < 5) pI++;
							pN = 0;
							break;
						case Tameru:
							if (pI < 5) pI++;
							if (pN < 5) pN++;
							break;
						case Mamoru:
							if (pI < 5) pI++;
							break;
					}
					break;
				case Mamoru:
					switch (N[i]) {
						case Kougekida:
							if (pN == 0) {
								winner = Winner.Isono;
							} else if (pN == 5) {
								winner = Winner.Nakajima;
							}
							pN = 0;
							break;
						case Tameru:
							if (pN < 5) pN++;
							break;
						case Mamoru:
							break;
					}
					break;
			}

			if (winner != Winner.None) break;

		}

		if (winner == Winner.Isono) {
			System.out.println("Isono-kun");
		} else if (winner == Winner.Nakajima) {
			System.out.println("Nakajima-kun");
		} else {
			System.out.println("Hikiwake-kun");
		}

	}
}