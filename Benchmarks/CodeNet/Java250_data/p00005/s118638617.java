import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (input.ready()) {
				String[] dataStr = input.readLine().split(" ");
				int[] dataInt = new int[dataStr.length];
				for (int i = 0; i < dataStr.length; i++) {
					dataInt[i] = Integer.valueOf(dataStr[i]);
				}
				System.out.println(getGCD(dataInt[0], dataInt[1]) + " " + getLCM(dataInt[0], dataInt[1]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/***
	 * ?????§??¬?´???°
	 */
	public static int getGCD(int a, int b) {
		if (a == b)
			return a;
		int d = 1;
		if (a < b) {
			if (b % a == 0)
				return a;
			d = a / 2 + 1;
		} else {
			if (a % b == 0)
				return b;
			d = b / 2 + 1;
		}
		for (int i = d; i > 0; i--) {
			if ((a % i == 0) & (b % i == 0)) {
				return i;
			}
		}
		return 0;
	}

	/***
	 * ????°???¬?????°
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getLCM(int a, int b) {
		int productA = a;
		int productB = b;
		while (productA <= 2000000000) {
			if (productA == productB) {
				return productA;
			}
			if (productA < productB) {
				productA += a;
			} else {
				productB += b;
			}
		}
		return 0;
	}
}