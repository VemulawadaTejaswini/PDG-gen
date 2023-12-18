import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		String oct;
		StringBuilder sb;
		while (!(line = br.readLine()).equals("0")) {
			oct = Integer.toOctalString(Integer.parseInt(line));
			sb = new StringBuilder();
			for (char c : oct.toCharArray()) {
				if (c == '4')
					sb.append('5');
				else if (c > '4')
					sb.append((char) (int) c + 2);
				else
					sb.append(c);
			}
			System.out.println(sb.toString());
		}
	}
}