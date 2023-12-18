

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {

		// ex : This is a pen.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// input sample
		char[] firstInput = br.readLine().toCharArray();

		// method call
		Count(firstInput);

	}

	static void Count(char[] test) {

		// int cntA = 0;
		// int cntB = 0;
		// int cntC = 0;
		// int cntD = 0;
		// int cntE = 0;
		// int cntF = 0;
		// int cntG = 0;
		// int cntH = 0;
		// int cntI = 0;
		// int cntJ = 0;
		// int cntK = 0;
		// int cntL = 0;
		// int cntM = 0;
		// int cntN = 0;
		// int cntO = 0;
		// int cntP = 0;
		// int cntQ = 0;
		// int cntR = 0;
		// int cntS = 0;
		// int cntT = 0;
		// int cntU = 0;
		// int cntV = 0;
		// int cntW = 0;
		// int cntX = 0;
		// int cntY = 0;
		// int cntZ = 0;

		// Count, for
		int[] cntAlpha = new int[26];
		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < test.length; i++) {

			// ex : This is a pen.
			// split the Alpha
			if (test[i] == 'a' || test[i] == 'A') {
				cntAlpha[0]++;
				continue;
			} else if (test[i] == 'b' || test[i] == 'B') {
				cntAlpha[1]++;
				continue;
			} else if (test[i] == 'c' || test[i] == 'C') {
				cntAlpha[2]++;
				continue;
			} else if (test[i] == 'd' || test[i] == 'D') {
				cntAlpha[3]++;
				continue;
			} else if (test[i] == 'e' || test[i] == 'E') {
				cntAlpha[4]++;
				continue;
			} else if (test[i] == 'f' || test[i] == 'F') {
				cntAlpha[5]++;
				continue;
			} else if (test[i] == 'g' || test[i] == 'G') {
				cntAlpha[6]++;
				continue;
			} else if (test[i] == 'h' || test[i] == 'H') {
				cntAlpha[7]++;
				continue;
			} else if (test[i] == 'i' || test[i] == 'I') {
				cntAlpha[8]++;
				continue;
			} else if (test[i] == 'j' || test[i] == 'J') {
				cntAlpha[9]++;
				continue;
			} else if (test[i] == 'k' || test[i] == 'K') {
				cntAlpha[10]++;
				continue;
			} else if (test[i] == 'l' || test[i] == 'L') {
				cntAlpha[11]++;
				continue;
			} else if (test[i] == 'm' || test[i] == 'M') {
				cntAlpha[12]++;
				continue;
			} else if (test[i] == 'n' || test[i] == 'N') {
				cntAlpha[13]++;
				continue;
			} else if (test[i] == 'o' || test[i] == 'O') {
				cntAlpha[14]++;
				continue;
			} else if (test[i] == 'p' || test[i] == 'P') {
				cntAlpha[15]++;
				continue;
			} else if (test[i] == 'q' || test[i] == 'Q') {
				cntAlpha[16]++;
				continue;
			} else if (test[i] == 'r' || test[i] == 'R') {
				cntAlpha[17]++;
				continue;
			} else if (test[i] == 's' || test[i] == 'S') {
				cntAlpha[18]++;
				continue;
			} else if (test[i] == 't' || test[i] == 'T') {
				cntAlpha[19]++;
				continue;
			} else if (test[i] == 'u' || test[i] == 'U') {
				cntAlpha[20]++;
				continue;
			} else if (test[i] == 'v' || test[i] == 'V') {
				cntAlpha[21]++;
				continue;
			} else if (test[i] == 'w' || test[i] == 'W') {
				cntAlpha[22]++;
				continue;
			} else if (test[i] == 'x' || test[i] == 'X') {
				cntAlpha[23]++;
				continue;
			} else if (test[i] == 'y' || test[i] == 'Y') {
				cntAlpha[24]++;
				continue;
			} else if (test[i] == 'z' || test[i] == 'Z') {
				cntAlpha[25]++;
				continue;
			}
		}
		// System.out.println(cntA);
		// System.out.println(cntB);
		// System.out.println(cntC);
		// System.out.println(cntD);
		// System.out.println(cntE);
		// System.out.println(cntF);
		// System.out.println(cntG);
		// System.out.println(cntH);
		// System.out.println(cntI);
		// System.out.println(cntJ);
		// System.out.println(cntK);
		// System.out.println(cntL);
		// System.out.println(cntM);
		// System.out.println(cntN);
		// System.out.println(cntO);
		// System.out.println(cntP);
		// System.out.println(cntQ);
		// System.out.println(cntR);
		// System.out.println(cntS);
		// System.out.println(cntT);
		// System.out.println(cntU);
		// System.out.println(cntV);
		// System.out.println(cntW);
		// System.out.println(cntX);
		// System.out.println(cntY);
		// System.out.println(cntZ);

		// output sample
		for (int i = 0; i < cntAlpha.length; i++) {
			System.out.println(alpha[i] + " : " + cntAlpha[i]);
		}

	}
}