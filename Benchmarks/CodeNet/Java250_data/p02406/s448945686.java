import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			int num = Integer.parseInt(input);
			int i, x;
			String ret = "";
			for (i = 2; i <= num; i++) {
				x = i;
				if (x % 3 == 0) {
					ret = ret + " " + i;
				} else {
					ret = INCLUDE3(ret, i, x);
				}
			}
			System.out.println(ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String INCLUDE3(String ret, int i, int x) {
		if (x % 10 == 3) {
			ret = ret + " " + i;
		} else {
		x = x / 10;
		if (x > 0) {
			ret = INCLUDE3(ret, i, x);
		}
}
		return ret;
	}
}