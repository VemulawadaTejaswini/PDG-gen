
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		String ans ="No";
		for (int i = 0; i < s.length(); i++) {
			String a = "";
			for (int j = 0; j < s.length(); j++) {
				if (j == s.length() - 1) {
					a = s.substring(j, j + 1) + a;
				} else {
					a += s.substring(j, j + 1);
				}
			}
			if (a.equals(t)) {
				ans = "Yes";
				break;
			}
			s = a;
		}
		System.out.println(ans);
	}
}