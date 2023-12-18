import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long count = 0;
		int[] s = new int[S.length()+1];
		int[] b = new int[S.length()+1];
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '<') {
				s[i+1] = s[i]+1;
			}
		}
		for (int i = S.length()-1; -1 < i; i--) {
			char c = S.charAt(i);
			if (c == '>') {
				b[i] = b[i+1]+1;
			}
		}
		for (int i = 0; i < s.length; i++) {
			count += Math.max(s[i], b[i]);
		}
		System.out.println(count);
		
	}
}