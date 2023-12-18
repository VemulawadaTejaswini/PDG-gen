

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		boolean next = false;
		for (int i = 0; i < t.length(); i++) {
			boolean is = false;
			if (next) {
				next = false;
				continue;
			}
			if (t.charAt(i) == '?') {
				if (i >= 1) {
					if (t.charAt(i-1) == 'P') {
						StringBuilder stringBuilder = new StringBuilder(t);
						stringBuilder.setCharAt(i, 'D');
						t = stringBuilder.toString();
						is = true;
					} else if (i == t.length()-1) {
						StringBuilder stringBuilder = new StringBuilder(t);
						stringBuilder.setCharAt(i, 'D');
						t = stringBuilder.toString();
						is = true;
					}
				}
				if (i != t.length()-1 && !is) {
					if (t.charAt(i+1) == 'D' || t.charAt(i+1) == '?') {
						StringBuilder stringBuilder = new StringBuilder(t);
						stringBuilder.setCharAt(i, 'P');
						stringBuilder.setCharAt(i+1, 'D');
						t = stringBuilder.toString();
						next = true;
					}
				}
			}
		}
		System.out.println(t);
	}

}
