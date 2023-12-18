import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String END = "END_OF_TEXT";
		String str;
		int cnt = 0;
		while ((str = br.readLine()).equals(END)) {
			str = str.toLowerCase();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (String.valueOf(c).equals("w")) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}