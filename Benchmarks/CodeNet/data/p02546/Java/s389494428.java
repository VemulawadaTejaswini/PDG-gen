import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String str[] = s.split("");

		if (str[str.length - 1].equals("s")) {
			System.out.println(s + "es");
		} else {
			System.out.println(s + "s");
		}
	}
}
