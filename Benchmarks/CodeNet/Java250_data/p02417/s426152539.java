import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] AtoZ = new int[26];
		String s = "";
		while (sc.hasNext()) {
			s += sc.next();
		}
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (c>=65&&c<=90 || c>=97&&c<=122) {
				if (c>=65&&c<=90) {c += 32;}
				int n = (char)(c-97);
				AtoZ[n]++;
			}
		}
		for (int i=0; i<26; i++) {
			char c = (char)(i+97);
			System.out.println(c+" "+":"+" "+AtoZ[i]);
		}
	}
}
