import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String w = br.readLine().toLowerCase();
		String[ ] tList = new String[10];
		int cnt = 0;
		String t;
		while (!(t = br.readLine()).equals("END_OF_TEXT")) {
			tList = t.split(" ");
			for (String target : tList) {
				if (target.equalsIgnoreCase(w)) cnt++;
			}
		}
		System.out.println(cnt);
	}
}