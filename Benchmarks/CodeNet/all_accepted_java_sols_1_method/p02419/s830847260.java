import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int cnt = 0;
		String line;
		while ((line = br.readLine()) != null) {
			if (line.equals("END_OF_TEXT"))
				break;

			for (String w : line.split(" ")) {
				if (word.equalsIgnoreCase(w))
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}