import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line = br.readLine()) != null) {
			int a, b, gcm;
			a = Integer.parseInt(line.substring(0, line.indexOf(" ")));
			b = Integer.parseInt(line.substring(line.indexOf(" ") + 1));
			gcm = getGCD(a, b);
			System.out.println(gcm + " " + getLCM(a, b, gcm));
		}
	}

	public static int getGCD(int a, int b) {

		int mod;
		int gt = a >= b ? a : b;
		int lt = a <= b ? a : b;

		do {
			mod = gt % lt;
			gt = lt;
			lt = mod;
		} while (mod != 0);

		return gt;
	}

	public static long getLCM(int a, int b, int gcm) {
		return (long) a * (long) b / gcm;
	}
}