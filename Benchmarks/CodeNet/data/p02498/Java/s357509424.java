import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			String s = br.readLine();
			String t = "";
			int i = 0;
			while(i < s.length()) {
				if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					t += String.valueOf(s.charAt(i)).toLowerCase();
				else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
					t += String.valueOf(s.charAt(i)).toUpperCase();
				else 
					t += String.valueOf(s.charAt(i));
				i++;
			}
			System.out.println(t);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}