import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input = br.readLine().toCharArray();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input.length; i++) {
			char target = input[i];
			if (Character.isUpperCase(target)) {
				sb.append(String.valueOf(target).toLowerCase());
			} else if (Character.isLowerCase(target)) {
				sb.append(String.valueOf(target).toUpperCase());
			} else {
				sb.append(String.valueOf(target));
			}
		}
		System.out.println(sb.toString());

	}
}