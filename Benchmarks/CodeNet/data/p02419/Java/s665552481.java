import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String w = br.readLine().toLowerCase();

		String t    = null;
		String line	= null;
		int	sum		= 0;
		
		do {
			line = br.readLine().toLowerCase();
			if ("END_OF_TEXT".equals(line.toUpperCase())) break;
			t += line;
		} while (true);
		
		for (int i = 0; i < t.length(); i++) {
			int j = t.indexOf(w, i);
			if (j >= 0) {
				sum++;
				i = j;
			}
		}
		
		System.out.println(sum);
	}
}