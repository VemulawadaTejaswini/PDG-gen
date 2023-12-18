
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer to;
		String s;
		while ((s = reader.readLine()) != null) {
			to = new StringTokenizer(s);
			int a = Integer.parseInt(to.nextToken());
			int b = Integer.parseInt(to.nextToken());
			int GCD = getGCD(a, b);
			int LCM = getLCM(a, b, GCD);
			builder.append(GCD).append(' ').append(LCM).append('\n');

		}
		System.out.print(builder);
	}

	public static int getGCD(int a, int b) {
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		while (a != 0) {
			tmp = a;
			a = b % a;
			b = tmp;
		}
		return b;
	}

	public static int getLCM(int a, int b, int GCD) {
		return a / GCD * b;
	}
}