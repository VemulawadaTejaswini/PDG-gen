import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sd = sc.next();
		String t = sc.next();
		
		ArrayList<String> ss = new ArrayList<String>();
		for(int i = 0; i < sd.length() - t.length() + 1; i++) {
			int j;
			for(j = 0; j < t.length(); j++) {
				if(sd.charAt(i + j) != '?' && sd.charAt(i + j) != t.charAt(j)) {
					break;
				}
			}
			if(j >= t.length()) {
				ss.add((sd.substring(0,  i) + t + sd.substring(i + t.length())).replace('?',  'a'));
			}
		}
		
		if(ss.size() == 0) {
			System.out.println("UNRESTORABLE");
		} else {
			String[] s = new String[50];
			int i = 0;
			for(String str : ss) {
				s[i] = str;
			}
			Arrays.sort(s, 0, i);
			System.out.println(s[0]);
		}		

	}

}
