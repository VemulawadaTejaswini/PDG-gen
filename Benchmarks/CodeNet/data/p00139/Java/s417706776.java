package Snakes;

import java.io.*;
import java.util.regex.Pattern;

public class Main {

	Pattern a = Pattern.compile(">\\'(=+)#\\1~");
	Pattern b = Pattern.compile(">\\^(Q=)+~~");

	public static void main(String[] args) throws Exception {
		Main me = new Main();
		BufferedReader bfr = new BufferedReader(
				new InputStreamReader(System.in));
		try {
			int num = Integer.parseInt(bfr.readLine());
			String res;
			for (int i = 0; i < num; i++) {
				res = me.judge(bfr.readLine());
				System.out.println(res);
			}
		} catch (NumberFormatException e) {

		}

	}

	private String judge(String str) {
		String res;
		if (a.matcher(str).matches()) {
			res = "A";
		} else if (b.matcher(str).matches()) {
			res = "B";
		} else {
			res = "NA";
		}
		return res;
	}

}