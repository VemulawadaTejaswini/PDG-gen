package volume02.pck2012;

/**
 * All Numbers Lead to 6174
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0000")) {

			int N = parseInt(line), L, S;
			byte[] numS = new byte[10];
			byte[] numL = new byte[10];

			int k;
			int c = 0;

			if (N == 0 || N % 1111 == 0) {
				System.out.println("NA");
			} else {
				
				while (N != 6174) {

					//N
					Arrays.fill(numS, (byte) 0);
					Arrays.fill(numL, (byte) 0);
					k = 1000;
					for (int i = 0; i < 4; i++) {
						int n = N / k;
						numS[n]++;
						numL[n]++;
						N -= n * k;
						k /= 10;
					}

					//S
					k = 1000;
					S = 0;
					for (int i = 0; i < 10; i++) {
						while (numS[i] > 0) {
							S += i * k;
							numS[i]--;
							k /= 10;
						}
					}

					//L
					k = 1000;
					L = 0;
					for (int i = 9; i >= 0; i--) {
						while (numL[i] > 0) {
							L += i * k;
							numL[i]--;
							k /= 10;
						}
					}

					N = L - S;
					c++;
				}
				System.out.println(c);
			}
		}
	}
}