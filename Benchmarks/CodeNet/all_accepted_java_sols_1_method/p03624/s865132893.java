import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b[] = a.toCharArray();
		int c[] = new int[26];
		String d = "";
		for(int i = 0; i < b.length; i++) {
			c[b[i] - 'a']++;
		}
		for(int i = 0; i < 26; i++) {
			if(c[i] == 0) {
				d = d + (char)('a' + i);
			}
		}
		if(d.length() > 0) {
			System.out.print(d.charAt(0));
		}else {
			System.out.print("None");
		}
	}
}