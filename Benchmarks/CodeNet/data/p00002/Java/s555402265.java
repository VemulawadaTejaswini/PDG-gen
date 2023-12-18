import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		int ans = 0;
		String strTemp1, strTemp2;
		// final String BR = System.getProperty("line.separator");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] readLine = in.readLine().split(" ");
			if (readLine.length == 1) {
				break;
			}
			strTemp1 = readLine[0];
			strTemp2 = readLine[1];
			ans = strTemp1.length() + strTemp2.length();
			System.out.println(ans);
		}
	}
}