import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str.equals("-")) break; 
			int m = Integer.parseInt(br.readLine());
			for (int i = 0; i < m; i++) {
				int h = Integer.parseInt(br.readLine());
				str = str.substring(h, str.length()) + str.substring(0, h);
			}
			System.out.println(str);
		}
	}
}