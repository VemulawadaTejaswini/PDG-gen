import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String readline;
		int[] num = new int[26];
		char a = 'a';
		while((readline = br.readLine().toLowerCase()) != null) {
			for(int i = 0; i < readline.length(); i++) {
				char c = readline.charAt(i);
				if(Character.isLetter(c)) {
					num[c - 'a']++;
				}
			}

			for(int i = 0; i < num.length; i++) {
				sb.append(a++).append(" ").append(":").append(" ").append(num[i]).append("\n");
			}
		}
		System.out.print(sb);
	}
}