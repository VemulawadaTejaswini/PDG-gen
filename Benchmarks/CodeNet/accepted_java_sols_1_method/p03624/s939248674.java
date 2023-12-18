import java.util.*;
public class Main {
	public static void main(String[] args) {
		int ct[] = new int [26];
		int i;
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		char[] c = S.toCharArray();
		for(i = 0; i < c.length; i++) {
			ct[c[i] - 'a']++;
		}
		for(i = 0; i < ct.length; i++) {
			if(ct[i] == 0) break;
		}
		if(i == 26) System.out.println("None"); 
		else {
			char s = (char) i;
			s = (char) (s + 'a');
			System.out.println(s);
		}
		scan.close();
	}
}