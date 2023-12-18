

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		String S = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			S = br.readLine();
			br.close();
		} catch (IOException e) {

		}
		int s = Integer.parseInt(S);
		int s2 = s % 60;
		int h = s / 3600;
		int m = s % 3600 / 60;
		System.out.println(h + ":" + m + ":" + s2);
	}
}

