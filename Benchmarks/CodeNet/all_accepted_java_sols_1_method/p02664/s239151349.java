import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int n = Integer.parseInt(br.readLine());

		String s = br.readLine();
		long count = s.chars().filter(ch -> ch == '?').count();
		count += s.chars().filter(ch -> ch == 'D').count();
		s = s.replace("?", "D");

		String str[] = s.split("");

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i].equals("P") && str[i + 1].equals("D")) {
				count++;
			}
		}

		System.out.println(s);
	}
}