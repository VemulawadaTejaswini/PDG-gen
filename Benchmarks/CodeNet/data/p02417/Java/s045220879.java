import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		String s;
		char a = 'a';
		boolean endflag = false;
		int count[] = new int[26];
		BufferedReader kbd = new BufferedReader(
				new InputStreamReader(System.in));
		while (true){
			s = kbd.readLine();
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '.')
					endflag = true;
				if (Character.isLetter(s.charAt(i)))
					count[Character.toLowerCase(s.charAt(i)) - 'a']++;
			}
			if(endflag)
				break;
		}
		for (int i = 0; i < 26; i++)
			System.out.println(a++ + " : " + count[i]);
		System.out.println("");
	}

}