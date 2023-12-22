import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		int diff = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)) {
				diff++;
			}
		}
		System.out.println(diff);
	}

}
