
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		int n = Integer.parseInt(reader.readLine());
		while (n-- > 0) {
			String lines = reader.readLine();
			int[] nums = new int[lines.length()];
			char[] chs = new char[lines.length()];
			for (int i = 0; i < lines.length(); i++) {
				chs[i] = lines.charAt(i);
			}
			Arrays.sort(chs);
			char[] chs2 = new char[chs.length];
			int count = 0;
			for (int i = chs.length-1; i >= 0; i--) {
				chs2[count] = chs[i];
				count++;
			}
			int a = Integer.parseInt(String.valueOf(chs2));
			int b = Integer.parseInt(String.valueOf(chs));
			System.out.println(a - b);

		}

	}
}