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
			int i;
			String ret = "";
			for (i = 2; i <= num; i++) {
				ret = CHECK_NUM(i, ret);
			}
			System.out.println(ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static String CHECK_NUM(int i, String ret) {
		if (i % 3 == 0) {
			ret = ret + " " + i;
		} else {
			ret = INCLUDE3(i, ret);
		}
		return ret;
	}

	static String INCLUDE3(int i, String ret) {
		if (i <= 0) {
			return ret;
		} else if (i % 10 == 3) {
			ret = ret + " " + i;
		} else {
			ret = INCLUDE3(i / 10, ret);
		}
		return ret;
	}
}