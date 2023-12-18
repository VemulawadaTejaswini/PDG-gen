import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		String str = br.readLine();
		if (str.length() <= k) {
			System.out.println(str);
		} else {
			String s = str.substring(0, k);
			System.out.println(s + "...");
		}
	}
}
