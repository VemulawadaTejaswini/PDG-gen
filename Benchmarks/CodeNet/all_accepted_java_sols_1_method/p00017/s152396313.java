import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0017
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNextLine()) {
			char[] cs = sc.nextLine().toCharArray();
			for (int i = 0; i < 26; i++) {
				char[] cs2 = new char[cs.length];
				for (int j = 0; j < cs.length; j++) {
					char c = cs[j];
					if (c != ' ' && c != '.') {
						c = (char)((int)(c - 'a' + i) % 26 + 'a');
					}
					cs2[j] = c;
				}
				
				String tmp = new String(cs2);
				//System.out.println(tmp);
				if (tmp.indexOf("the") >= 0 || tmp.indexOf("this") >= 0 || tmp.indexOf("that") >= 0) {
					System.out.println(tmp);
					break;
				}
			}
		}
	}
}