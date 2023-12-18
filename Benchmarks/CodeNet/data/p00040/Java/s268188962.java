

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		char[][][] affine = new char[26][26][26];

		char[][][] invaffine = new char[26][26][26];

		for (int i = 0; i < 26; i++) {

			for (int j = 0; j < 26; j++) {

				for (int k = 0; k < 26; k++) {

					affine[i][j][k] = (char) (((i * j + k) % 26) + 'a');

					invaffine[(((i * j + k) % 26) )][j][k] = (char)(i+'a');

				}

			}

		}

		String[][][] thisThat = new String[2][26][26];

		for (int i = 0; i < 26; i++) {

			for (int j = 0; j < 26; j++) {

				if (i % 2 != 0 && i % 13 != 0) {

					thisThat[0][i][j] = "";

					thisThat[1][i][j] = "";

					thisThat[0][i][j] += affine['t' - 'a'][i][j];

					thisThat[0][i][j] += affine['h' - 'a'][i][j];

					thisThat[0][i][j] += affine['i' - 'a'][i][j];

					thisThat[0][i][j] += affine['s' - 'a'][i][j];

					thisThat[1][i][j] += affine['t' - 'a'][i][j];

					thisThat[1][i][j] += affine['h' - 'a'][i][j];

					thisThat[1][i][j] += affine['a' - 'a'][i][j];

					thisThat[1][i][j] += affine['t' - 'a'][i][j];

					// System.out.println(thisThat[0][i][j] + " "+

					// thisThat[1][i][j]);

				}

			}

		}

		int n = sc.nextInt();

		for (int q = 0; q < n; q++) {

			String target = sc.nextLine();

			target = sc.nextLine();

			int afi = 0;

			int afb = 0;

			for (int i = 0; i < 26; i++) {

				for (int j = 0; j < 26; j++) {

					if (i % 2 != 0 && i % 13 != 0) {

						for (String parts : target.split(" ")) {

							if (parts.equals(thisThat[0][i][j])

									|| parts.equals(thisThat[1][i][j])) {

								afi = i;

								afb = j;

							}

						}

					}

				}

			}

			String ans = "";

			for (Character c : target.toCharArray()) {

				if (Character.isLetter(c)) {

					ans += invaffine[c - 'a'][afi][afb];

				} else {

					ans += c;

				}

			}

			System.out.println(ans);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();



	}

}