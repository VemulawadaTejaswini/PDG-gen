import java.util.*;
import java.util.regex.*;

public class Main {
	
	public static Scanner in = new Scanner(System.in);
	public static Pattern p = Pattern.compile(" ");
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		while (in.hasNext())
			solve();
	}
	
	public static void solve() {
		String[] I = p.split(in.nextLine());
		int n = findOffset(I);
		for(int i = 0; i<I.length; i++) {
			for(int j = 0; j<I[i].length(); j++) {
				char c = I[i].charAt(j);
				if(Character.isLetter(c)) {
					System.out.print(calc(c,n));
				} else
					System.out.print(c);
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static int findOffset(String[] I) {
		for(int i = 0; i<I.length; i++) {
			String s = I[i].replace(".","");
			if(s.length() == 3 && matches(s,"the")) {
				return s.charAt(0) - 't';
			} else if (s.length() == 4 && (matches(s,"this") || matches(s,"that"))) {
				return s.charAt(0) - 't';
			}
		}
		return -1;
	}
	
	public static boolean matches(String a, String b) {
		//len a must equal len b
		for(int i = 1; i<b.length(); i++) {
			if(a.charAt(i) - a.charAt(i-1) != b.charAt(i) - b.charAt(i-1))
				return false;
		}
		return true;
	}
	
	public static char calc(char c, int n) {
		int t = c-'a';
		t -= n;
		t %= 26;
		return alphabet.charAt(t);
	}
	
	public static boolean check(String[] I, int offset) {
		boolean[] found = new boolean[3];
		for(int i = 0; i<3; i++)
			found[i] = false;
		
		for(int i = 0; i<I.length; i++) {
			StringBuffer b = new StringBuffer();
			for(int j = 0; j<I[i].length(); j++) {
				if(Character.isLetter(I[i].charAt(j)))
					b.append(calc(I[i].charAt(j),offset));
			}
			String B = b.toString();
			if(B.equals("the"))
				found[0] = true;
			else if (B.equals("this"))
				found[1] = true;
			else if (B.equals("that"))
				found[2] = true;
		}
		for(int i = 0; i<3; i++)
			if(!found[i])
				return false;
		return true;
	}

}