import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder answer = new StringBuilder();
			String lb = System.getProperty("line.separator");
			
			String str = input.readLine();
			while (!"-".equals(str)) {
				final int m = Integer.parseInt(input.readLine());
				for (int i = 0; i < m; i++) {
					final int h = Integer.parseInt(input.readLine());
					str = str.substring(h) + str.substring(0, h);
				}
				answer.append(str).append(lb);
				str = input.readLine();
			}
			input.close();
			
			System.out.print(answer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}