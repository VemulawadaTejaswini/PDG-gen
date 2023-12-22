import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();

		Loop:{
			for (int i = 0; i < str1.length(); i++) {
				StringBuilder sb = new StringBuilder(str2.length());
				for (int j = 0; j < str2.length(); j++) {
					sb.append(str1.charAt((i + j) % str1.length()));
				}
				if (sb.toString().equals(str2)) {
					System.out.println("Yes");
					break Loop;
				}
			}
			System.out.println("No");
		}
	}
}