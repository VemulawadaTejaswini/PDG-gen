import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		String[] ch = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		String[] CH = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		int[] con = new int[26];
		Pattern p, P;
		Matcher m, M;
		int longcounter =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				while (true) {
			String str;
			try {
				str = br.readLine();
				if(str==null){
					break;
				}
				longcounter += str.length();
				if(longcounter>=1200){
					break;
				}
				for (int i = 0; i < 26; i++) {
					p = Pattern.compile(ch[i]);
					P = Pattern.compile(CH[i]);
					m = p.matcher(str);
					M = P.matcher(str);
					while (true) {
						if (m.find() || M.find()) {
							con[i]++;
						} else {
							break;
						}
					}
				}
			if(longcounter<1200){
			for (int i = 0; i < 26; i++) {
				System.out.println(ch[i] + " : " + con[i]);
			}
			}
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
	 }	
	}
}