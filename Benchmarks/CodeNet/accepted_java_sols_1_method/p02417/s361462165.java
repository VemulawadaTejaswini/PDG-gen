import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String s;
		char a = 'a';
		int count[] = new int[26];
		BufferedReader kbd = new BufferedReader(
				new InputStreamReader(System.in));
		while ((s = kbd.readLine()) != null){
			for (int i = 0; i < s.length(); i++) {
				if (Character.isLetter(s.charAt(i)))
					count[Character.toLowerCase(s.charAt(i)) - 'a']++;
			}
		}
		for (int i = 0; i < 26; i++)
			System.out.println(a++ + " : " + count[i]);
	}

}