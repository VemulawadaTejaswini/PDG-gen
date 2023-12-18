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
			int in1 = Integer.valueOf(se[0]);
			int in2 = Integer.valueOf(se[1]);
			int in3 = Integer.valueOf(se[2]);
			if (in1 == 0 && in2 == 0 && in3 == 0)
				break;
			doMain(++inCnt, in1, in2, in3);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, int in1, int in2, int in3) {
		int f = 0;
		for (int i = in1; i <= in2; i++)
			if ((in3 % i) == 0)
				f++;

		System.out.println(f);

	}
}