import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	/**
	 * AOJ 0005 GCD and LCM
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String input = bufferedReader.readLine();
		String[] twoStr;
		while (input != null) {
			twoStr = input.split("\\s");
			int[] twoInt = getintArray(twoStr);
			int gcd = getGCD(twoInt);
			int lcm = getLCM(twoInt, gcd);
			System.out.println(gcd + " " + lcm);
			input = bufferedReader.readLine();
		}
	}

	/**
	 * String????????????int?????????????????????????????????????????????????????´??????
	 *
	 * @param strArray
	 *            String?????????
	 * @return int?????????
	 */
	private static int[] getintArray(String[] strArray) {
		int[] intArray = new int[strArray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		Arrays.sort(intArray);
		return intArray;
	}

	private static int getGCD(int[] twoIntOrg) {
		int tmp, diff;
		int[] twoInt = { twoIntOrg[0], twoIntOrg[1] };
		while (twoInt[0] != twoInt[1]) {
			diff = twoInt[1] - twoInt[0];
			if (diff > twoInt[0]) {
				twoInt[1] = diff;
			} else {
				tmp = twoInt[0];
				twoInt[0] = diff;
				twoInt[1] = tmp;
			}
		}
		return twoInt[0];
	}

	private static int getLCM(int[] twoInt, int gcd) {
		return twoInt[0] / gcd * twoInt[1];
	}
}