import java.io.*;

public class Main {
	
	public static String decode (String str) {
		
		String ret = "";
		
		for (int i = 1; i <= 25; i++) {
			ret = "";
			for (int j = 0; j < str.length(); j++) {
				if (0 <= str.charAt(j) - 'a' && str.charAt(j) - 'a' <= 25) {
					ret += (char)((str.charAt(j) - 'a' + i) % 26 + 'a');
				} else {
					ret += str.charAt(j);
				}
			}
			if (ret.indexOf("the") != -1 || ret.indexOf("that") != -1 || ret.indexOf("this") != -1) {
				return ret;
			}
		}
		
		return null;
	}
	
	public static void main (String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(decode(str));
		}
		
	}
	
}