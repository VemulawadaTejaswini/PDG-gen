import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = br.readLine();
		String temp = br.readLine();

		if (str.contains(temp)) {
			for (int i = 0; i + temp.length() <= str.length(); i++) {
				if (str.substring(i, i + temp.length()).equals(temp)) {
					sb.append(i + "\n");
				}
			}
			System.out.print(sb.toString());
		}
	}
}