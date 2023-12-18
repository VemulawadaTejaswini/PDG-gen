import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String S = s.next();
		String T = s.next();
		char[] t = T.toCharArray();
		
		String question = "";
		for(int i = 0; i < T.length(); i++) {
			question += "?";
		}
		if(S.lastIndexOf(question) > -1) {
			String rest = S.substring(0, S.lastIndexOf(question));
			System.out.println(rest.replaceAll("\\?", "a") + T);
			return;
		}
		
		String cur;
		for(int i = S.length() - T.length(); i > -1; i--) {
			cur = S.substring(i, i + T.length());
			for(int j = T.length() - 1; j > -1; j--) {
				if(cur.charAt(j) == t[j] || cur.charAt(j) == '?') {
					if(j == 0) {
						String front = S.substring(0, i).replaceAll("\\?", "a");
						String back = S.substring(i + T.length()).replaceAll("\\?", "a");
						System.out.println(front + T + back);
						return;
					}
				}else {
					break;
				}
			}
		}
		System.out.println("UNRESTORABLE");
    }
}