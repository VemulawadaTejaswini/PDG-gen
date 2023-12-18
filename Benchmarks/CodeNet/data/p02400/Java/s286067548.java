import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			String[] se = s.split(" ");
			Double in1 = Double.valueOf(se[0]);
			doMain(++inCnt, in1);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, Double in1) {
		Double a = 2 * in1 * Math.PI;
		Double b = in1 * in1 * Math.PI;
		System.out.printf("%f %f\n", b, a);

	}
}