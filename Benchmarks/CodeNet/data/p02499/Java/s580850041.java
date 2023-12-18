import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String input = br.readLine();
			if (input.isEmpty()) {
				break;
			}
			int[] array = new int[26];
			for (int i = 0; i < input.length(); i++) {
				String tmp = input.toLowerCase();
				Character temp = tmp.charAt(i);
				int num = temp - 'a';
				if (num < 0 || num > 25) {
					continue;
				}
				array[num] = array[num] + 1;
			}

			for (int i = 0; i < 26; i++) {
				int n = i + 'a';
				System.out.println((char) n + " : " + array[i]);
			}
		}

	}
}